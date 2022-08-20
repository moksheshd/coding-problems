package com.mokshesh.cp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SubarrayWithGivenSumTest {
  private static SubarrayWithGivenSum subarrayWithGivenSum;

  @BeforeAll
  static void setUp() {
    subarrayWithGivenSum = new SubarrayWithGivenSum();
  }

  static Stream<Arguments> generateData() {
    return Stream.of(
//      Arguments.arguments(new int[]{1, 1, 1}, 2, 2),
//      Arguments.arguments(new int[]{1, 2, 3}, 3, 2)
      Arguments.arguments(new int[]{1, 2, 3, 4, 5}, 5, new int[]{2, 3}),
      Arguments.arguments(new int[]{1, 2, 3, 2, 5}, 7, new int[]{2, 3, 2}),
      Arguments.arguments(new int[]{5, 10, 20, 100, 105}, 110, new int[]{-1})
    );
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void solve(int[] nums, int k, int[] expectedResult) {
    int[] actualResult = subarrayWithGivenSum.solve(nums, k);
    Assertions.assertThat(actualResult)
      .containsSequence(expectedResult);
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void solveV2(int[] nums, int k, int[] expectedResult) {
    int[] actualResult = subarrayWithGivenSum.solveV2(nums, k);
    Assertions.assertThat(actualResult)
      .containsSequence(expectedResult);
  }
}
