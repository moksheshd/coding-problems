package com.mokshesh.cp.stacks;

import java.util.Objects;
import java.util.Stack;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>You are given a string <strong>A</strong>.</p>
 * <p>  </p>
 * <p>An operation on the string is defined as follows:</p>
 * <p>Remove the first occurrence of the same consecutive characters. eg for a string "abbcd", the first occurrence of same consecutive characters is "bb".</p>
 * <p>Therefore the string after this operation will be "acd".</p>
 * <p>Keep performing this operation on the string until there are no more occurrences of the same consecutive characters and return the final string.</p>
 * </div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= |A| &lt;= 100000</p></div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p> First and only argument is string A.</p></div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the final string.</p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 * <p>  </p>
 * <pre> A = abccbc
 * </pre>
 * <p>  </p>
 * <p>Input 2:</p>
 * <p>  </p>
 * <pre> A = ab
 * </pre>
 * </div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p><pre> "ac"
 * </pre>
 * <p>Output 2:</p>
 * <pre> "ab"
 * </pre>
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 * <pre>Remove the first occurrence of same consecutive characters. eg for a string "abbc", <br>the first occurrence of same consecutive characters is "bb".
 * Therefore the string after this operation will be "ac".
 * </pre>
 * <p>Explanation 2:</p>
 * <pre> No removals are to be done.
 * </pre>
 * </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/remove-all-duplicate-adjacent-characters-from-a-string-using-stack/">geeksforgeeks</a>
 * @level medium
 * @topic stacks
 */
public class DoubleCharacterTrouble {
  public String solve(String s) {
    // we maintain a stack for the characters of the string
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      // if the current character is equal to the top of the stack then they form
      // a pair of consecutive similar characters therefore we pop from the stack,
      // else we push the character in the stack
      Character currentCharacter = s.charAt(i);
      if (!stack.isEmpty() && Objects.equals(stack.peek(), currentCharacter)) {
        stack.pop();
      } else {
        stack.push(currentCharacter);
      }
    }

    // we need to pop the entire stack, append to the string and reverse the string to get the result
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
      result.append(stack.pop());
    }
    result.reverse();
    return result.toString();
  }
}
