package com.mokshesh.cp.search;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.<br> If not, return the index where it would be if it were inserted in order.</p>
 * <p><strong>NOTE: </strong>You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.</p>
 * </div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>1 &lt;= N &lt;= 10<sup>6</sup></p>
 * </div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>The first argument is an integer array A of size N.<br>The second argument is an integer B.</p>
 * </div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>Return an integer denoting the index of target value.</p>
 * </div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>Input 1:</p>
 * <pre>A = [1, 3, 5, 6]
 * B = 5 </pre>
 * <p>Input 2:</p>
 * <pre>A = [1]
 * B = 1</pre>
 * </div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>Output 1:</p>
 * <pre>2 </pre>
 * <p>Output 2:</p>
 * <pre>0</pre>
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; ">
 * <p>Explanation 1:</p>
 * <pre>The target value is present at index 2. </pre>
 * <p>Explanation 2:</p>
 * <pre>The target value is present at index 0.</pre>
 * </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/search-insert-position/">leetcode</a>
 * @level easy
 * @topic search
 */
public class SortedInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int low = 0;
    int high = n - 1;
    int mid;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return low;
  }
}
