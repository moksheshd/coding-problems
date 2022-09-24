package com.mokshesh.cp.tree;

import com.mokshesh.cp.helper.TreeNode;

import java.util.*;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a binary tree, return the inorder traversal of its nodes' values.</p>
 *     <p><strong>NOTE:</strong> Using recursion is not allowed.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p> 1 &lt;= number of nodes &lt;= 10<sup>5</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First and only argument is root node of the binary tree, A.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return an integer array denoting the inorder traversal of the given binary tree.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre>   1
 *     \
 *      2
 *     /
 *    3</pre>
 *     <p>Input 2:</p>
 *     <pre>   1
 *   / \
 *  6   2
 *     /
 *    3</pre></div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> [1, 3, 2]</pre>
 *     <p>Output 2:</p>
 *     <pre> [6, 1, 3, 2]</pre></div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> The Inorder Traversal of the given tree is [1, 3, 2].</pre>
 *     <p>Explanation 2:</p>
 *     <pre> The Inorder Traversal of the given tree is [6, 1, 3, 2].</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://www.interviewbit.com/problems/inorder-traversal/">interviewbit</a>
 * @level easy
 * @topic tree
 */
public class InorderTraversal {
  List<Integer> result = new ArrayList<>();
  public int[] inorderTraversal(TreeNode treeNode) {
    return inorder(treeNode).stream().mapToInt(Integer::intValue).toArray();
  }

  // Recursive version
  private List<Integer> inorder(TreeNode root){
    if (root == null) {
      return result;
    }
    inorder(root.left);
    result.add(root.val);
    inorder(root.right);
    return result;
  }

  // Iterative version
  public List<Integer> inorderV2(TreeNode root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    if(root == null) {
      return result;
    }
    TreeNode current = root;
    while(current != null || !stack.isEmpty()) {
      while(current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();
      result.add(current.val);
      current = current.right;
    }
    return result;
  }
}
