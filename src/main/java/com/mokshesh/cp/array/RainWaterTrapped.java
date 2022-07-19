package com.mokshesh.cp.array;

/**
 * <div class="html-content__container cr-p-statement">
 *   <p><strong>Problem Description</strong><br>
 *   </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Given a vector <strong>A</strong> of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>1 &lt;= <strong>|A|</strong> &lt;= 100000</p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p> First and only argument is the vector <strong>A</strong> </p>
 *   </div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p> Return one integer, the answer to the question</p>
 *   </div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Input 1:</p>
 *     <pre>A = [0, 1, 0, 2]
 * </pre>
 *     <p>Input 2:</p>
 *     <pre>A = [1, 2]
 * </pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Output 1:</p>
 *     <pre>1
 * </pre>
 *     <p>Output 2:</p>
 *     <pre>0
 * </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Explanation 1:</p>
 *     <pre>1 unit is trapped on top of the 3rd element.
 * </pre>
 *     <p>Explanation 2:</p>
 *     <pre>No water is trapped.
 * </pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/trapping-rain-water/">geeksforgeeks</a>
 * @link <a href="https://www.interviewbit.com/problems/rain-water-trapped/">interviewbit</a>
 * @level hard
 * @topic array
 */
public class RainWaterTrapped {
  /**
   * <p><strong><u>Method :</u></strong> This is a simple solution to the above problem.</p>
   * <p>
   * <ul>
   *   <li><strong>Approach:</strong> The idea is to traverse every array element and find the highest bars on the left and right sides. Take the smaller of two heights. The difference between the smaller height and the height of the current element is the amount of water that can be stored in this array element.</li>
   *   <li>
   *     <strong>Algorithm:</strong>&nbsp;
   *     <ol>
   *       <li>Traverse the array from start to end.</li>
   *       <li>For every element, traverse the array from start to that index and find the maximum height <i>(a)</i> and traverse the array from the current index to end, and find the maximum height <i>(b)</i>.</li>
   *       <li>The amount of water that will be stored in this column is <i>min(a,b) – array[i]</i>, add this value to the total amount of water stored</li>
   *       <li>Print the total amount of water stored.</li>
   *     </ol>
   *   </li>
   * </ul>
   * <ul>
   *   <li>
   *     <strong>Complexity Analysis:</strong>&nbsp;
   *     <ul>
   *       <li><strong>Time Complexity:</strong> O(n<sup>2</sup>).&nbsp;<br>There are two nested loops traversing the array, So the time Complexity is O(n<sup>2</sup>).</li>
   *       <li><strong>Space Complexity:</strong> O(1).&nbsp;<br>No extra space is required.</li>
   *     </ul>
   *   </li>
   * </ul>
   *
   * @param a height of the building
   * @return total water harvested
   */
  public int trap1(final int[] a) {
    int n = a.length;
    // To store the maximum water that can be stored
    int totalWaterHarvested = 0;

    // For every element of the array except first and last element
    for (int i = 1; i < n - 1; i++) {

      // Find maximum element on its left
      int left = a[i];
      for (int j = 0; j < i; j++) {
        left = Math.max(left, a[j]);
      }

      // Find maximum element on its right
      int right = a[i];
      for (int j = i + 1; j < n; j++) {
        right = Math.max(right, a[j]);
      }

      // Update maximum water value
      totalWaterHarvested += Math.min(left, right) - a[i];
    }
    return totalWaterHarvested;
  }

  /**
   * <p><strong><u>Method 2:</u></strong> This is an efficient solution to the above problem.</p>
   * <ul>
   *   <li><strong>Approach:</strong> In the previous solution, to find the highest bar on the left and right, array traversal is needed, which reduces the efficiency of the solution. To make this efficient, one must pre-compute the highest bar on the left and right of every bar in linear time. Then use these pre-computed values to find the amount of water in every array element.</li>
   *   <li>
   *     <strong>Algorithm:</strong>&nbsp;
   *     <ol>
   *       <li>Create two arrays <i>leftMax</i> and <i>rightMax</i> of size n. create a variable <i>max = INT_MIN</i>.</li>
   *       <li>Run one loop from start to end. In each iteration update currentMax as <i>max = currentMax(max, arr[i])</i> and also assign <i>leftMax[i] = currentMax</i></li>
   *       <li>Update currentMax = INT_MIN.</li>
   *       <li>Run another loop from end to start. In each iteration update currentMax as <i>currentMax = max(currentMax, arr[i])</i> and also assign <i>rightMax[i] = currentMax</i></li>
   *       <li>Traverse the array from start to end.</li>
   *       <li>The amount of water that will be stored in this column is <i>min(a,b) – array[i]</i>,(where a = leftMax[i] and b = rightMax[i]) add this value to total amount of water stored</li>
   *     </ol>
   *   </li>
   * </ul>
   * <ul>
   *   <li>
   *     <strong>Complexity Analysis:</strong>&nbsp;
   *     <ul>
   *       <li><strong>Time Complexity:</strong> O(n).&nbsp;<br>Only one traversal of the array is needed, So time Complexity is O(n).</li>
   *       <li><strong>Space Complexity:</strong> O(n).&nbsp;<br>Two extra arrays are needed, each of size n.</li>
   *     </ul>
   *   </li>
   * </ul>
   *
   * @param a height of the building
   * @return total water harvested
   */
  public int trap2(final int[] a) {
    // An element of the array can store water if there are higher bars on the left and right.
    // The amount of water to be stored in every element can be found by finding the heights of bars on the left and right sides.
    // The idea is to compute the amount of water that can be stored in every element of the array.
    int n = a.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    int currentMax = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      currentMax = Math.max(currentMax, a[i]);
      leftMax[i] = currentMax;
    }
    currentMax = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      currentMax = Math.max(currentMax, a[i]);
      rightMax[i] = currentMax;
    }

    int totalWaterHarvested = 0;
    for (int i = 0; i < n; i++) {
      int currentHeight = a[i];
      int waterCaptured = Math.min(leftMax[i], rightMax[i]) - currentHeight;
      if (waterCaptured > 0) {
        totalWaterHarvested += waterCaptured;
      }
    }
    return totalWaterHarvested;
  }
}
