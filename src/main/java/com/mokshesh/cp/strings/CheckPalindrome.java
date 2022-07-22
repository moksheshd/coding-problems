package com.mokshesh.cp.strings;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Write a <strong>recursive</strong> function that checks whether string <strong>A</strong> is
 *     a palindrome or Not.<br> Return 1 if the string A is a palindrome, else return 0.</p>
 *     <p><strong>Note:</strong> A palindrome is a string that's the same when read forward and backward.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= A &lt;= 50000</p>
 *     <p>String A consists only of lowercase letters.</p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first and only argument is a string A.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return 1 if the string A is a palindrome, else return 0.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = "naman"</pre>
 *     <p>Input 2:</p>
 *     <pre> A = "strings"</pre>
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
 *     <pre> "naman" is a palindomic string, so return 1.</pre>
 *     <p>Explanation 2:</p>
 *     <pre> "strings" is not a palindrome, so return 0.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.interviewbit.com/problems/check-palindrome/">interviewbit</a>
 * @level easy
 * @topic recursion
 */
public class CheckPalindrome {
  public int solve(String a) {
    return palindrome(a, 0, a.length() - 1);
  }

  int palindrome(String a, int s, int e) {
    if (s >= e) {
      return 1;
    }
    if (a.charAt(s) != a.charAt(e)) {
      return 0;
    }
    return palindrome(a, s + 1, e - 1);
  }
}
