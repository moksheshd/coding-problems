package com.mokshesh.cp.misc;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; ">Implement <strong>pow(A, B) % C</strong>.
 *     <p>In other words, given <strong>A</strong>, <strong>B</strong> and <strong>C</strong>, <strong>Find (A<sup>B</sup> % C).</strong></p>
 *     <p><strong>Note:</strong> The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; ">-10<sup>9</sup> &lt;= A &lt;= 10<sup>9</sup><br>0 &lt;= B &lt;= 10<sup>9</sup><br>1 &lt;= C &lt;=
 *     10<sup>9</sup></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; ">Given three integers A, B, C.</div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; ">Return an integer.</div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; ">A = 2, B = 3, C = 3</div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; ">2</div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; ">2<sup>3</sup> % 3 = 8 % 3 = 2</div>
 * </div>
 *
 * @link <a href="https://www.interviewbit.com/problems/implement-power-function/">interviewbit</a>
 * @level easy
 * @topic recursion
 */
public class ImplementPowerFunction {
  public int pow(int a, int n, int mod) {
    if (a == 0) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }
    /*
    
     */
    int temp = modulo(pow(a, n / 2, mod), mod);
    temp = modulo((long) temp * temp, mod);
    if (n % 2 == 0) {
      return temp;
    } else {
      if (n > 0) {
        return modulo((long) temp * a, mod);
      } else {
        return temp / n;
      }
    }
  }

  public int modulo(long num, int mod) {
    long res = num % mod;
    if (res < 0) {
      return (int) (res + mod) % mod;
    }
    return (int) res;
  }
}
