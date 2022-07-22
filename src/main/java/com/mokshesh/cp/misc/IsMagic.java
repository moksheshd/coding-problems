package com.mokshesh.cp.misc;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a number <strong>A</strong>, check if it is a <strong>magic number</strong> or not.</p>
 *     <p>A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the
 *       single digit comes out to be 1, then the number is a magic number.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= A &lt;= 10<sup>9</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first and only argument is an integer A.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return an 1 if the given number is magic else return 0.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = 83557</pre>
 *     <p>Input 2:</p>
 *     <pre> A = 1291</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> 1</pre>
 *     <p>Output 2:</p>
 *     <pre> 0</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> Sum of digits of (83557) = 28
 *  Sum of digits of (28) = 10
 *  Sum of digits of (10) = 1.
 *  Single digit is 1, so it's a magic number. Return 1.</pre>
 *     <p>Explanation 2:</p>
 *     <pre> Sum of digits of (1291) = 13
 *  Sum of digits of (13) = 4
 *  Single digit is not 1, so it's not a magic number. Return 0.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/check-number-magic-recursive-sum-digits-1/">geeksforgeeks</a>
 * @level easy
 * @topic recursion
 */
public class IsMagic {
  public int solve(int a) {
    if (a < 10) {
      if (a == 1) {
        return 1;
      }
      return 0;
    }
    return solve(sumDigits(a));
  }

  private int sumDigits(int a) {
    if (a == 0) {
      return a;
    }
    return a % 10 + sumDigits(a / 10);
  }

  /**
   * The function will determine if the remainder of dividing the input by 9 is 1 or not.
   * If it is 1, then the number is a magic number.
   * The divisibility rule of 9 says that a number is divisible by 9 if the sum of its digits is also divisible by 9.
   * Therefore, if a number is divisible by 9, then, recursively, all the digit sums are also divisible by 9.
   * The final digit sum is always 9. An increase of 1 in the original number will increase the ultimate value by 1,
   * making it 10, and the ultimate sum will be 1, thus verifying that it is a magic number.
   *
   * @param a number
   * @return int
   */
  public int solveV2(int a) {
    if (a % 9 == 1) {
      return 1;
    }
    return 0;
  }
}
