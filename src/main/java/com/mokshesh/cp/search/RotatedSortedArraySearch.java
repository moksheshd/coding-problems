package com.mokshesh.cp.search;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a sorted array of integers
 *     <strong>A</strong> of size N and an integer <strong>B</strong>.</p>
 *     <p>array A is rotated at some pivot unknown to you beforehand.</p>
 *     <p>(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).</p>
 *     <p>You are given a target value B to search. If found in the array, return its index otherwise, return -1.</p>
 *     <p>You may assume no duplicate exists in the array.</p>
 *     <p><strong>NOTE: </strong>Users are expected to solve this in O(log(N)) time.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= N &lt;= 1000000</p>
 *     <p>1 &lt;= A[i] &lt;= 10^9</p>
 *     <p>all elements in A are distinct.</p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first argument given is the integer
 *     array A.</p>
 *     <p>
 *       The second argument given is the integer B.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return index of B in array A, otherwise
 *     return -1</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1: </p>
 *     <pre>A = [4, 5, 6, 7, 0, 1, 2, 3]
 * B = 4 </pre>
 *     <p>Input 2: </p>
 *     <pre>A = [1]
 * B = 1</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1: </p>
 *     <pre> 0 </pre>
 *     <p>Output 2: </p>
 *     <pre> 0</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1: </p>
 *     <pre>
 * Target 4 is found at index 0 in A. </pre>
 *     <p>Explanation 2: </p>
 *     <pre>
 * Target 1 is found at index 0 in A.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">leetcode</a>
 * @level easy
 * @topic search
 */
public class RotatedSortedArraySearch {
  private int findPivot(int[] nums, int low, int high) {
    if (nums[low] < nums[high]) {
      return 0;
    }
    while (low <= high) {
      int mid = (high - low) / 2 + low;
      if (nums[mid] > nums[mid + 1]) {
        return mid + 1;
      } else {
        if (nums[mid] < nums[low]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
    }
    return 0;
  }

  private int search(int[] nums, int low, int high, int target) {
    int mid = 0;
    while (low <= high) {
      mid = (high - low) / 2 + low;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else if (nums[mid] > target) {
        high = mid - 1;
      }
    }
    return -1;
  }

  public int search(int[] nums, int target) {
    int n = nums.length;
    if (n == 1) {
      return nums[0] == target ? 0 : -1;
    }

    int pivot = findPivot(nums, 0, n - 1);

    if (pivot == 0) {
      return search(nums, 0, n - 1, target);
    }
    // Using the pivot either search the 1st part or 2nd part
    if (nums[0] <= target) {
      return search(nums, 0, pivot, target);
    }
    return search(nums, pivot, n - 1, target);
  }
}
