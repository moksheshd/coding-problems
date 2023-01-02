package com.mokshesh.leetcode;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class FetchProblemsTest {
  private static final Logger logger = LoggerFactory.getLogger(FetchProblemsTest.class);

  private static final String LEETCODE_API = "https://leetcode.com/graphql";
  private static final String RESPONSE_DIR = "src/test/java/com/mokshesh/leetcode/hard/response";
  private static final int PROBLEMS_PER_PAGE = 50;

  @Test
  void fetchAndSaveAllMediumProblems() throws IOException {
    // Create response directory if it doesn't exist
    Files.createDirectories(Paths.get(RESPONSE_DIR));

    int skip = 0;
    int pageNum = 1;
    boolean hasMore = true;

    while (hasMore) {
      String query = String.format("""
        {
            problemsetQuestionList: questionList(
                categorySlug: ""
                limit: %d
                skip: %d
                filters: { difficulty: HARD }
            ) {
                total: totalNum
                questions: data {
                    questionId
                    title
                    titleSlug
                    difficulty
                    acRate
                    status
                    frontendQuestionId: questionFrontendId
                }
            }
        }
        """, PROBLEMS_PER_PAGE, skip);

      Map<String, String> requestBody = new HashMap<>();
      requestBody.put("query", query);

      logger.info("Fetching page {} with skip {}", pageNum, skip);

      // Make request to LeetCode GraphQL API
      Response apiResponse = given()
        .contentType(ContentType.JSON)
        .header("Accept", "application/json")
        .header("User-Agent", "Mozilla/5.0")
        .header("Referer", "https://leetcode.com/problemset/")
        .header("Origin", "https://leetcode.com")
        .log().all()
        .body(requestBody)
        .when()
        .post(LEETCODE_API)
        .then()
        .log().all()
        .extract()
        .response();

      String response = apiResponse.asString();
      int statusCode = apiResponse.getStatusCode();
      logger.info("Response status code: {}", statusCode);

      if (statusCode != 200) {
        logger.error("Error response: {}", response);
        throw new RuntimeException(String.format("Failed to fetch problems. Status code: %d, Response: %s",
          statusCode, response));
      }

      // Verify we got valid JSON response
      try {
        JsonPath jsonPath = new JsonPath(response);
        if (!jsonPath.getMap("$").containsKey("data")) {
          throw new RuntimeException("Invalid response format: no 'data' field found");
        }
      } catch (Exception e) {
        logger.error("Failed to parse response as JSON: {}", response, e);
        throw new RuntimeException("Invalid JSON response", e);
      }
      logger.info("Successfully received response for page {}", pageNum);

      // Save response to file
      String fileName = String.format("page_%d.json", pageNum);
      Path filePath = Paths.get(RESPONSE_DIR, fileName);
      try (FileWriter writer = new FileWriter(filePath.toFile())) {
        writer.write(response);
        logger.info("Saved response to {}", filePath);
      } catch (IOException e) {
        logger.error("Failed to save response to file: {}", filePath, e);
        throw e;
      }

      // Parse response to check if there are more pages
      JsonPath jsonPath = new JsonPath(response);
      int total = jsonPath.getInt("data.problemsetQuestionList.total");

      skip += PROBLEMS_PER_PAGE;
      pageNum++;
      hasMore = skip < total;

      // Add delay to avoid rate limiting
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new RuntimeException("Thread interrupted while fetching problems", e);
      }
    }
  }
}
