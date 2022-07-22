package com.mokshesh.cp.misc;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Write a program to find the factorial of the given number <strong>A</strong>.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>0 &lt;= A &lt;= 12</p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First and only argument is an integer <strong>A</strong>.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return an integer denoting the factorial of the number <strong>A</strong>.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = 4</pre>
 *     <p>Input 2:</p>
 *     <pre> A = 1</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> 24</pre>
 *     <p>Output 2:</p>
 *     <pre> 1</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> Factorial of 4 = 4 * 3 * 2 * 1 = 24</pre>
 *     <p>Explanation 2:</p>
 *     <pre> Factorial of 1 = 1</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/program-for-factorial-of-a-number/">geeksforgeeks</a>
 * @level easy
 * @topic recursion
 */
public class FindFactorial {
  public int solve(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return solve(n - 1) * n;
  }
}
