package com.mokshesh.cp.array.dimensional;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a 2D integer matrix <strong>A</strong> of size <code>N x N,</code> find a <code>B x B</code> submatrix where B&lt;= N and B&gt;= 1, such that <strong>the</strong> <strong>sum of all the elements in the submatrix is maximum</strong>.</p></div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= N &lt;= 10<sup>3</sup>.</p><p>1 &lt;= B &lt;= N </p>
 * <p>-10<sup>2</sup> &lt;= A[i][j] &lt;= 10<sup>2</sup>.</p>
 * </div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First arguement is an 2D integer matrix <strong>A</strong>.</p><p>Second argument is an integer <strong>B</strong>.</p>
 * </div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return a single integer denoting the maximum sum of submatrix of size <code>B x B</code>.</p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p><pre> A = [
 *         [1, 1, 1, 1, 1]
 *         [2, 2, 2, 2, 2]
 *         [3, 8, 6, 7, 3]
 *         [4, 4, 4, 4, 4]
 *         [5, 5, 5, 5, 5]
 *      ]
 *  B = 3
 * </pre>
 * <p>Input 2:</p>
 * <pre> A = [
 *         [2, 2]
 *         [2, 2]
 *     ]
 *  B = 2
 * </pre>
 * </div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p><pre> 48
 * </pre>
 * <p>Output 2:</p>
 * <pre> 8
 * </pre>
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p><pre>    Maximum sum 3 x 3 matrix is
 *     8 6 7
 *     4 4 4
 *     5 5 5
 *     Sum = 48
 * </pre>
 * <p>Explanation 2:</p>
 * <pre> Maximum sum 2 x 2 matrix is
 *   2 2
 *   2 2
 *   Sum = 8
 * </pre>
 * </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/print-maximum-sum-square-sub-matrix-of-given-size/">geeksforgeeks</a>
 * @link <a href="https://www.interviewbit.com/problems/maximum-sum-square-submatrix/">interviewbit</a>
 * @level medium
 * @topic array, 2d-array
 */
public class MaximumSumSquareSubMatrix {

  private int[][] generatePrefixSumMatrix(int[][] input) {
    int rows = input.length;
    int columns = input[0].length;
    int[][] prefixSum = new int[rows][columns];

    // column wise sum
    for (int j = 0; j < columns; j++) {
      int sum = 0;
      for (int i = 0; i < rows; i++) {
        sum = sum + input[i][j];
        prefixSum[i][j] = sum;
      }
    }

    // row-wise sum
    for (int i = 0; i < rows; i++) {
      int sum = 0;
      for (int j = 0; j < columns; j++) {
        sum = sum + prefixSum[i][j];
        prefixSum[i][j] = sum;
      }
    }
    return prefixSum;
  }

  public int solve(int[][] a, int b) {
    int maxSum = Integer.MIN_VALUE;
    b = b - 1;
    int n = a.length;
    int[][] prefixSumMatrix = generatePrefixSumMatrix(a);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        int a1 = i;
        int b1 = j;

//        Plotting point a2 as a1 + b as we need b x b matrix
        int a2 = a1 + b;
        int b2 = b1 + b;
//        If a2 goes beyond the actual matrix then we can ignore those a1 and b1
        if (a2 >= n || b2 >= n) {
          continue;
        }

//        prefixSumMatrix of (a2,b2) gives the sum from (0,0) to (a2,b2) but what we require is (a1,b1) to (a2,b2)
//        hence we remove all the un-required areas. i.e.
//        1. remove (0,0) to (a1-1,b2) using prefixSumMatrix of (a1-1,b2)
//        2. remove (0,0) to (a2,b1-1) using prefixSumMatrix of (a2,b1-1)
//        If you observe that the area (0,0) to (a1-1,b1-1) has been subtracted twice in step 1 and step 1. hence adding it once
//        3. add (0,0) to (a1-1,b1-1) using prefixSumMatrix of (a1-1,b1-1)
        int sum = 0;
        sum = prefixSumMatrix[a2][b2];
        if (a1 - 1 >= 0) {
          sum -= prefixSumMatrix[a1 - 1][b2];
        }
        if (b1 - 1 >= 0) {
          sum -= prefixSumMatrix[a2][b1 - 1];
        }
        if (a1 - 1 >= 0 && b1 - 1 >= 0) {
          sum += prefixSumMatrix[a1 - 1][b1 - 1];
        }
        maxSum = Math.max(maxSum, sum);
      }
    }
    return maxSum;
  }
}
