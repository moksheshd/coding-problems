package com.mokshesh.cp.misc;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a number <strong>A</strong>, we need to find the sum of its digits using recursion.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= A &lt;= 10<sup>9</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first and only argument is an integer <strong>A</strong>.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return an integer denoting the sum of digits of the number <strong>A</strong>.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = 46</pre>
 *     <p>Input 2:</p>
 *     <pre> A = 11</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> 10</pre>
 *     <p>Output 2:</p>
 *     <pre> 2</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1: </p>
 *     <pre> Sum of digits of 46 = 4 + 6 = 10
 * </pre>
 *     <p>Explanation 2:</p>
 *     <pre> Sum of digits of 11 = 1 + 1 = 2</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/sum-digit-number-using-recursion/">geeksforgeeks</a>
 * @level easy
 * @topic recursion
 */
public class SumOfDigits {
  public int solve(int a) {
    if (a == 0) {
      return a;
    }
    /*
        The remainder of n and 10 will give the last digit of a number
        e.g. 123 % 10 = 3 (last digit)

        The quotient of n ad 10 will remove the last digit
        e.g. 123 / 10 = 12 (removes the last digit)
     */
    return solve(a / 10) + a % 10;
  }
}
