package com.mokshesh.cp.tree;

import com.mokshesh.cp.helper.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>You are given an integer array
 *     <strong>A</strong> denoting the <strong>Level Order Traversal</strong> of the Binary Tree.</p>
 *     <p>You have to Deserialize the given Traversal in the Binary Tree and return the <strong>root</strong> of the Binary
 *       Tree.</p>
 *     <p><strong>NOTE:</strong></p>
 *     <ul>
 *       <li>In the array, the NULL/None child is denoted by -1.</li>
 *       <li>For more clarification check the Example Input.</li>
 *     </ul>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p> 1 &lt;= number of nodes &lt;= 10<sup>5</sup>
 *   </p>
 *     <p> -1 &lt;= A[i] &lt;= 10<sup>5</sup></p>
 *   </div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>Only argument is an integer array A
 *     denoting the Level Order Traversal of the Binary Tree.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the root node of the Binary
 *     Tree.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre> A = [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]</pre>
 *     <p>Input 2:</p>
 *     <pre> A = [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre>
 *            1
 *          /   \
 *         2     3
 *        / \
 *       4   5
 * </pre>
 *     <p>Output 2:</p>
 *     <pre>
 *             1
 *           /   \
 *          2     3
 *         / \ .   \
 *        4   5 .   6
 * </pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 *  Since 3, 4 and 5 each has both NULL child we had represented that using -1.</pre>
 *     <p>Explanation 2:</p>
 *     <pre> Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 *  Since 3 has left child as NULL while 4 and 5 each has both NULL child.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">leetcode</a>
 * @level hard
 * @topic tree
 */
public class DeserializeBinaryTree {

  public TreeNode solve(int[] levelOrderTraversal) {
    return helper(levelOrderTraversal);
  }

  /**
   * We can do this simply by using a queue data structure.
   * <p>
   * We know that the root node will always be the first element of level order traversal.
   * Create a root node and push the root node into the queue.
   * <p>
   * Now, run a loop until the queue is empty and keep a variable, let's say i, for denoting the current index in the Level Order Traversal.
   * <p>
   * Pop the Node: If the node is not NULL, then the element at index i will be the left child, and the element at i+1 will be the right child.
   * Create those children and push the left child and right child of the node, respectively, in the queue.
   * <p>
   * After building the tree, return the root node.
   *
   * @return root node
   */
  private TreeNode helper(int[] levelOrderTraversal) {
    TreeNode root = new TreeNode(levelOrderTraversal[0]);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int i = 1;
    while (!queue.isEmpty()) {
      TreeNode node = queue.remove();
      if (node == null) {
        continue;
      }
      int leftValue = levelOrderTraversal[i];
      int rightValue = levelOrderTraversal[i + 1];

      i += 2;

      if (leftValue == -1) {
        node.left = null;
      } else {
        node.left = new TreeNode(leftValue);
      }
      if (rightValue == -1) {
        node.right = null;
      } else {
        node.right = new TreeNode(rightValue);
      }
      queue.add(node.left);
      queue.add(node.right);
    }
    return root;
  }
}
