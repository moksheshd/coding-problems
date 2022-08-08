package com.mokshesh.cp.search;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given an array of integers
 *     <strong>A</strong>, find and return the peak element in it. An array element is peak if it is NOT smaller than its
 *     neighbors. </p>
 *     <p>For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.</p>
 *     <p><strong>NOTE: </strong>Users are expected to solve this in O(log(N)) time.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= <strong>|A|</strong> &lt;=
 *     100000 </p>
 *     <p>1 &lt;= A[i] &lt;= 10<sup>9</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The only argument given is the integer
 *     array A.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the peak element.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre>A = [1, 2, 3, 4, 5]
 * </pre>
 *     <p>Input 2:</p>
 *     <pre>A = [5, 17, 100, 11]
 * </pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> 5
 * </pre>
 *     <p>Output 2:</p>
 *     <pre> 100</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1: </p>
 *     <pre> 5 is the peak.
 * </pre>
 *     <p>Explanation 2:</p>
 *     <pre> 100 is the peak.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/find-peak-element/">leetcode</a>
 * @level easy
 * @topic search
 */
public class PeakElement {
  public int solveV1(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        if (nums[i + 1] < nums[i]) {
          return nums[i];
        }
      } else if (i == n - 1) {
        if (nums[i - 1] < nums[i]) {
          return nums[i];
        }
      } else {
        if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
          return nums[i];
        }
      }
    }
    return -1;
  }

  public int solveV2(int[] nums) {
    // Try to think when will the unique answer exists,
    //Unique answer only exists when the elements first increases and then decreases.
    // Check is first or last element is the answer.
    int n = nums.length;
    //base cases
    if (n == 1) {
      return nums[0];
    }
    if (nums[1] <= nums[0]) {
      return nums[0];
    }
    if (nums[n - 1] >= nums[n - 2]) {
      return nums[n - 1];
    }
    int low = 1;
    int high = n - 2;
    while (low <= high) {
      int mid = (high - low) / 2 + low;
      if (nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1]) {
        return nums[mid];
      } else if (nums[mid] >= nums[mid - 1]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
