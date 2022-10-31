package com.mokshesh.cp.array;

import java.util.Scanner;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong>
 *   <br></p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Write a
 *     program to input an integer <strong>N</strong> from user and print hollow diamond star pattern
 *     series of N lines.</p>
 *     <p>See example for clarifications over the pattern.</p>
 *   </div>
 *   <strong>Problem Constraints</strong><br>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= N
 *     &lt;= 1000</p>
 *   </div>
 *   <strong>Input Format</strong><br>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First line is an
 *     integer <strong>N</strong></p>
 *   </div>
 *   <strong>Output Format</strong><br>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p><strong>N</strong>
 *     lines conatining only char '*' as per the question.</p>
 *   </div>
 *   <strong>Example Input</strong><br>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre>4</pre>
 *     <p>Input 2:</p>
 *     <pre>6</pre>
 *   </div>
 *   <strong>Example Output</strong><br>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre>
 * ********
 * ***  ***
 * **    **
 * *      *
 * *      *
 * **    **
 * ***  ***
 * ********</pre>
 *     <p>Output 2:</p>
 *     <pre>
 * ************
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
 * *          *
 * **        **
 * ***      ***
 * ****    ****
 * *****  *****
 * ************</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/program-print-hollow-pyramid-diamond-pattern/">geeksforgeeks</a>
 * @level easy
 * @topic general
 */
public class StarPatternI {
  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    printStarPatternI(n);

  }

  private static void printStarPatternI(int n) {
    int[][] result = new int[n * 2][n * 2];
    int currentN = n;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < currentN; j++) {
        result[i][j] = 1;
        result[i][(n * 2) - j - 1] = 1;
      }
      currentN--;
    }
    currentN = 1;
    for (int i = n; i < n * 2; i++) {
      for (int j = 0; j < currentN; j++) {
        result[i][j] = 1;
        result[i][(n * 2) - j - 1] = 1;
      }
      currentN++;
    }
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        if (result[i][j] == 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}
