package com.mokshesh.cp.array.dimensional;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a 2D Matrix <strong>A</strong> of dimensions <strong>N*N</strong>, we need to return the sum of all possible submatrices.</p></div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p> 1 &lt;= N &lt;=30 </p><p> 0 &lt;= A[i][j] &lt;= 10 </p>
 * </div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>Single argument representing a 2-D array A of size N x N.</p></div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return an integer denoting the sum of all possible submatrices in the given matrix.</p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><pre>A = [ [1, 1]
 *       [1, 1] ]
 * </pre></div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">16
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><pre>Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
 * Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
 * Number of submatrices with 3 elements = 0
 * Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
 * Total Sum = 4+8+4 = 16
 * </pre></div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/sum-of-all-submatrices-of-a-given-matrix/">geeksforgeeks</a>
 * @link <a href="https://www.scaler.com/academy/mentee-dashboard/class/29454/assignment/problems/4091">scaler</a>
 * @level medium
 * @topic array, 2d-array
 */
public class SumOfAllSubmatrices {

  // TODO Revist
  // Using contribution technique
  public int solve(int[][] a) {
    int n = a.length;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        // Number of ways to choose from top-left elements
        int topLeft = (i + 1) * (j + 1);

        // Number of ways to choose from bottom-right elements
        int bottomRight = (n - i) * (n - j);
        int contribution = topLeft * bottomRight;
        sum += (contribution * a[i][j]);
      }
    }
    return sum;
  }
}
