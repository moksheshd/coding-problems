package com.mokshesh.cp.array;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>You are given
 *     an array <strong>A</strong> consisting of heights of Christmas trees and an array
 *     <strong>B</strong> of the same size consisting of the cost of each of the trees
 *     (<strong>B<sub>i</sub></strong> is the cost of tree <strong>A<sub>i</sub></strong>, where
 *     <strong>1 ≤ i ≤ size(A</strong>)), and you are supposed to choose <strong>3</strong> trees
 *     (let's say, indices p, q, and r), such that <strong>A<sub>p</sub> &lt; A<sub>q</sub> &lt; A<sub>r</sub></strong>,
 *     where <strong>p &lt; q &lt; r</strong>. <br> The cost of these trees is <strong>B<sub>p</sub> +
 *       B<sub>q</sub> + B<sub>r</sub></strong>.</p>
 *     <p>You are to choose <strong>3</strong> trees such that their total cost is minimum. Return that
 *       cost.</p>
 *     <p>If it is not possible to choose 3 such trees return <strong>-1</strong>.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>1 &lt;= A[i], B[i] &lt;= 10<sup>9</sup><br> 3 &lt;= size(A) = size(B) &lt;= 3000</p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>First argument is an integer array A.<br> Second argument is an integer array B.</p>
 *   </div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in
 *       increasing order, if not possible, -1.</p>
 *   </div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Input 1:</p>
 *     <pre> A = [1, 3, 5]
 *  B = [1, 2, 3]</pre>
 *     <p>Input 2:</p>
 *     <pre> A = [1, 6, 4, 2, 6, 9]
 *  B = [2, 5, 7, 3, 2, 7]</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Output 1:</p>
 *     <pre> 6 </pre>
 *     <p>Output 2:</p>
 *     <pre> 7 </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Explanation 1:</p>
 *     <pre> We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6. </pre>
 *     <p>Explanation 2:</p>
 *     <pre> We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
 *  This is the minimum cost that we can get.
 * </pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/minimum-cost-of-choosing-3-increasing-elements-in-an-array-of-size-n/">geeksforgeeks</a>
 * @level easy
 * @topic array
 */
public class ChristmasTrees {
  /**
   * To solve this, let’s take three indices, p, q and r.
   * <p>
   * p is the index of the tree that is to be chosen first, i.e. the one with the smallest height.
   * q is the index of the tree that is to be chosen second, i.e. the one with the middle height.
   * r is the index of the tree that is to be chosen third, i.e. the one with the largest height.
   * We should now traverse the array by fixing index q. Lets N be the size of the array.
   * <p>
   * For q, that goes from index q+1 to N-1, we can find an index p that goes from 1 to q-1 such that A[p] < A[q], and B[p] is minimum.
   * Similarly, find an index r that goes from q+1 to N such that A[r] > A[q], and B[r] is minimum.
   * <p>
   * This way, for all q we can find the minimum values, and we choose the minimum values from all the q values.
   * <p>
   * Time Complexity : O(n^2)
   * Space Complexity(extra) : O(1)
   *
   * @param height - Height of the tree
   * @param cost   - Cost of the tree
   * @return
   */
  public int solve(int[] height, int[] cost) {
    int n = height.length;

    // To store the cost of choosing three elements
    int costThree = Integer.MAX_VALUE;

    // Fix the middle element
    for (int j = 0; j < n; j++) {

      // Initialize cost of the first
      // and the third element
      int costI = Integer.MAX_VALUE;
      int costK = Integer.MAX_VALUE;

      // Search for the first element
      // in the left subarray
      for (int i = 0; i < j; i++) {
        // If smaller element is found then update the cost
        if (height[i] < height[j]) {
          costI = Math.min(costI, cost[i]);
        }
      }

      // Search for the third element
      // in the right subarray
      for (int k = j + 1; k < n; k++) {

        // If greater element is found
        // then update the cost
        if (height[k] > height[j]) {
          costK = Math.min(costK, cost[k]);
        }
      }

      // If a valid triplet was found then
      // update the minimum cost so far
      if (costI != Integer.MAX_VALUE && costK != Integer.MAX_VALUE) {
        costThree = Math.min(costThree, cost[j] + costI + costK);
      }
    }

    // No such triplet found
    if (costThree == Integer.MAX_VALUE) {
      return -1;
    }

    return costThree;
  }
}
