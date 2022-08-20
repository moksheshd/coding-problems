package com.mokshesh.cp.array;

import java.util.Arrays;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given an array of positive
 *     integers A and an integer B, find and return first continuous subarray which adds to B.</p>
 *     <p>If the answer does not exist return an array with a single element "-1".</p>
 *     <p>First sub-array means the sub-array for which starting index in minimum.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= length of the array &lt;=
 *     100000<br>
 *     1 &lt;= A[i] &lt;= 10<sup>9</sup><br>
 *     1 &lt;= B &lt;= 10<sup>9</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first argument given is the integer
 *     array A.</p>
 *     <p>The second argument given is integer B.</p>
 *   </div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the first continuous sub-array
 *     which adds to B and if the answer does not exist return an array with a single element "-1".</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = [1, 2, 3, 4, 5]
 *  B = 5
 * </pre>
 *     <p>Input 2:</p>
 *     <pre> A = [5, 10, 20, 100, 105]
 *  B = 110
 * </pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> [2, 3]
 * </pre>
 *     <p>Output 2:</p>
 *     <pre> -1
 * </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> [2, 3] sums up to 5.
 * </pre>
 *     <p>Explanation 2:</p>
 *     <pre> No subarray sums up to required number.
 * </pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/subarray-sum-equals-k/">leetcode</a>
 * @level easy
 * @topic array
 */
public class SubarrayWithGivenSum {
  // For unsorted array
  public int[] solve(int[] nums, int k) {
    int n = nums.length;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum = 0;
      for (int j = i; j < n; j++) {
        sum += nums[j];
        if (sum == k) {
          int[] result = new int[j - i + 1];
          int index = 0;
          for (int l = i; l <= j; l++) {
            result[index++] = nums[l];
          }
          return result;
        }
      }
    }
    return new int[]{-1};
  }

  // For sorted array
  public int[] solveV2(int[] nums, int k) {
    int n = nums.length;
    int[] prefixSum = getPrefixSum(nums);

    int right = 0;
    int left = 1;
    while (right < n && left < n) {
      int sum = 0;
      if (right == 0) {
        sum = prefixSum[left];
      } else {
        sum = prefixSum[left] - prefixSum[right - 1];
      }
      if (sum == k) {
        return getSubarray(nums, right, left);
      } else if (sum > k) {
        right++;
      } else {
        left++;
      }
    }
    return new int[]{-1};
  }

  private int[] getPrefixSum(int[] nums) {
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      prefixSum[i] = nums[i] + prefixSum[i - 1];
    }
    return prefixSum;
  }

  private int[] getSubarray(int[] nums, int start, int end) {
    return Arrays.copyOfRange(nums, start, end + 1);
  }


}
