package com.mokshesh.cp.stacks;

import java.util.Objects;
import java.util.Stack;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given an
 *     expression string <strong>A</strong>, examine whether the pairs and the orders of <code>“{“,”}”,
 *       ”(“,”)”, ”[“,”]”</code> are correct in <strong>A</strong>.</p>
 *     <p>Refer to the examples for more clarity.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p> 1 &lt;= |A|
 *     &lt;= 100 </p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The first and the
 *     only argument of input contains the string A having the parenthesis sequence.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return 0 if the
 *     parenthesis sequence is not balanced.</p>
 *     <p>Return 1 if the parenthesis sequence is balanced.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = {([])}
 * </pre>
 *     <p>Input 2:</p>
 *     <pre> A = (){
 * </pre>
 *     <p>Input 3:</p>
 *     <pre> A = ()[] </pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1: </p>
 *     <pre> 1 </pre>
 *     <p>Output 2:</p>
 *     <pre> 0 </pre>
 *     <p>Output 3:</p>
 *     <pre> 1 </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p> You can
 *     clearly see that the first and third case contain valid parenthesis.</p>
 *     <p> In the second case, there is no closing bracket for {, thus the parenthesis sequence is
 *       invalid.</p>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/valid-parentheses/">leetcode</a>
 * @level easy
 * @topic stacks
 */
public class BalancedParenthesis {

  /**
   * First, let us look at the impossible cases:
   * 1) [() : There is no corresponding closing bracket for an opening bracket.
   * 2) [) : Incorrect closing bracket for an opening bracket.
   * 3) } : No opening bracket for a closed bracket.
   * <p>
   * Now, we can observe that the earlier a bracket is encountered in the string, the later it is closed.
   * We can guess that the Stack Data Structure will be used using this observation.
   * <p>
   * We traverse the given string from the left. If the i-th character is an opening bracket, we push it onto the stack.
   * If it is a closing bracket, we check for the impossible case 2 and case 3. If they are being violated, then we can simply return 0. Otherwise, we can pop the topmost bracket from the stack.
   * To check for case 1, if our stack is not empty at the end of our traversal, then we can say that the brackets are not correctly matched.
   * <p>
   * If all the conditions are fulfilled, then we can return 1.
   *
   * @param s
   * @return whether the string is balanced parenthesis
   */
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);
      if (character == '(' || character == '{' || character == '[') {
        stack.push(character);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char topCharacter = stack.pop();
        if ((Objects.equals(character, ')') && !Objects.equals(topCharacter, '(')) ||
          (Objects.equals(character, '}') && !Objects.equals(topCharacter, '{')) ||
          (Objects.equals(character, ']') && !Objects.equals(topCharacter, '['))
        ) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
