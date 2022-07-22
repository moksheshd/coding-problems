package com.mokshesh.cp.misc;

/**
 * <div class="html-content__container cr-p-statement">
 *   <p><strong>Problem Description</strong><br>
 *   </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>The Fibonacci numbers are the numbers in the following integer sequence.</p>
 *     <p>0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..</p>
 *     <p>In mathematical terms, the sequence F<sub>n</sub> of Fibonacci numbers is defined by the recurrence relation:</p>
 *     <p><strong>F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub></strong></p>
 *     <p>Given a number <strong>A</strong>, find and return the <strong>A<sup>th</sup></strong> Fibonacci Number.</p>
 *     <p>Given that F<sub>0</sub> = 0 and F<sub>1</sub> = 1.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>0 &lt;= A &lt;= 20</p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>First and only argument is an integer <strong>A</strong>.</p>
 *   </div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Return an integer denoting the <strong>A<sup>th</sup></strong> term of the sequence.</p>
 *   </div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Input 1:</p>
 *     <pre> A = 2
 * </pre>
 *     <p>Input 2:</p>
 *     <pre> A = 9
 * </pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Output 1:</p>
 *     <pre> 1
 * </pre>
 *     <p>Output 2:</p>
 *     <pre> 34
 * </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; ">
 *     <p>Explanation 1:</p>
 *     <pre> f(2) = f(1) + f(0) = 1
 * </pre>
 *     <p>Explanation 2:</p>
 *     <pre> f(9) = f(8) + f(7) = 21 + 13  = 34
 * </pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/">geeksforgeeks</a>
 * @level easy
 * @topic recursion
 */
public class FindFibonacciII {
  public int findAthFibonacci(int a) {
    return fibonacci(a);
  }

  private int fibonacci(int a) {
    if (a <= 1) {
      return a;
    }
    return fibonacci(a - 1) + fibonacci(a - 2);
  }
}
