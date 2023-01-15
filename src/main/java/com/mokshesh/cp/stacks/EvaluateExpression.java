package com.mokshesh.cp.stacks;

import java.util.List;
import java.util.Stack;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>An arithmetic expression is given by a string array <strong>A</strong> of size <strong>N</strong>. Evaluate the value of an arithmetic expression in <strong>Reverse Polish Notation</strong>.</p>
 * <p>  </p>
 * <p>Valid operators are +, -, *, /. Each string may be an integer or an operator.</p>
 * </div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= N &lt;= 10<sup>5</sup></p></div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>The only argument given is string array A.</p></div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the value of arithmetic expression formed using reverse Polish Notation.</p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><pre>Input 1:
 *     A =   ["2", "1", "+", "3", "*"]
 * </pre><pre>Input 2:
 *     A = ["4", "13", "5", "/", "+"]
 * </pre>
 * </div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><pre>Output 1:
 *     9
 * </pre><pre>Output 2:
 *     6
 * </pre>
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><pre>Explaination 1:
 *     starting from backside:
 *     * : () * ()
 *     3 : () * (3)
 *     + : (() + ()) * (3)
 *     1 : (() + (1)) * (3)
 *     2 : ((2) + (1)) * (3)
 *     ((2) + (1)) * (3) = 9
 * </pre><pre>Explaination 2:
 *     + : () + ()
 *     / : () + (() / ())
 *     5 : () + (() / (5))
 *     13 : () + ((13) / (5))
 *     4 : (4) + ((13) / (5))
 *     (4) + ((13) / (5)) = 6
 * </pre>
 * </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">leetcode</a>
 * @level medium
 * @topic stacks
 */
public class EvaluateExpression {
  public int evalRPN(List<String> tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String token : tokens) {
      if (isOperator(token)) {
        Integer operand2 = stack.pop();
        Integer operand1 = stack.pop();
        stack.push(calculate(operand1, operand2, token));
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }

  private boolean isOperator(String operator) {
    return "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);
  }

  private int calculate(Integer operand1, Integer operand2, String operator) {
    int result = 0;
    switch (operator) {
      case "+":
        result = operand1 + operand2;
        break;
      case "-":
        result = operand1 - operand2;
        break;
      case "*":
        result = operand1 * operand2;
        break;
      case "/":
        result = operand1 / operand2;
        break;
      default:
        break;
    }
    return result;
  }
}
