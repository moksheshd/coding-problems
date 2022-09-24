package com.mokshesh.cp.tree;

import com.mokshesh.cp.helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a binary tree, return the
 *     level order traversal of its nodes' values. (i.e., from left to right, level by level).</p></div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p> 1 &lt;= number of nodes &lt;= 10<sup>5</sup>
 *   </p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First and only argument is root node of
 *     the binary tree, A.</p></div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return a 2D integer array denoting the
 *     zigzag level order traversal of the given binary tree.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p>
 *     <pre>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 *     <p>Input 2:</p>
 *     <pre>
 *    1
 *   / \
 *  6   2
 *     /
 *    3</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p>
 *     <pre> [
 *    [3],
 *    [9, 20],
 *    [15, 7]
 *  ]</pre>
 *     <p>Output 2:</p>
 *     <pre> [
 *    [1]
 *    [6, 2]
 *    [3]
 *  ]</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p>
 *     <pre> Return the 2D array. Each row denotes the traversal of each level.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">leetcode</a>
 * @level medium
 * @topic tree
 */
public class LevelOrder {
  Queue<TreeNode> queue = new LinkedList<>();
  List<List<Integer>> levels = new ArrayList<>();

  public int[][] levelOrder(TreeNode root) {
    if (root == null) {
      return new int[][]{{}};
    }
    helper(root);
    return levels.stream().map(list -> list.stream().mapToInt(Integer::intValue)
        .toArray())
      .toArray(int[][]::new);
  }

  /**
   * <h4 id="approach-2-iteration">Approach: Iteration</h4>
   * <p><strong>Algorithm</strong></p>
   * <p>Let's keep nodes of each tree level in the <em>queue</em> structure,
   * which typically orders elements in a FIFO (first-in-first-out) manner.
   * In Java one could use <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html" rel="ugc"><code>LinkedList</code>
   * implementation of the <code>Queue</code> interface</a>.</p>
   * <p>The zero level contains only one node <code>root</code>. The algorithm is simple :</p>
   * <ul>
   *   <li>
   *     <p>Initiate queue with a <code>root</code> and start from the level number <code>0</code> :
   *       <code>level = 0</code>.</p>
   *   </li>
   *   <li>
   *     <p>While queue is not empty :</p>
   *     <ul>
   *       <li>
   *         <p>Start the current level by adding an empty list into output structure <code>levels</code>.</p>
   *       </li>
   *       <li>
   *         <p>Compute how many elements should be on the current level : it's a
   *           queue length.</p>
   *       </li>
   *       <li>
   *         <p>Pop out all these elements from the queue and add them into the current
   *           level.</p>
   *       </li>
   *       <li>
   *         <p>Push their child nodes into the queue for the next level.</p>
   *       </li>
   *       <li>
   *         <p>Go to the next level <code>level++</code>.</p>
   *       </li>
   *     </ul>
   *   </li>
   * </ul>
   *
   * @param root current node of the tree
   */
  void helper(TreeNode root) {
    queue.add(root);
    while (!queue.isEmpty()) {
      // start the current level
      List<Integer> level = new LinkedList<>();
      int size = queue.size();

      // number of elements in the current level
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.remove();

        // fulfill the current level
        level.add(node.val);

        // add child nodes of the current level
        // in the queue for the next level
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      levels.add(level);
    }
  }

  /**
   * <h4 id="approach-1-recursion">Approach: Recursion</h4>
   * <p><strong>Algorithm</strong></p>
   * <p>The simplest way to solve the problem is to use a recursion. Let's
   * first ensure that the tree is not empty, and then call recursively the function
   * <code>helper(node, level)</code>, which takes the current node and its level as the arguments.</p>
   * <p>This function does the following :</p>
   * <ul>
   *   <li>
   *     <p>The output list here is called <code>levels</code>, and hence the current level is
   *       just a length of this list <code>len(levels)</code>.
   *       Compare the number of a current level <code>len(levels)</code> with a node level <code>level</code>.
   *       If you're still on the previous level - add the new one by adding a
   *       new list into <code>levels</code>.</p>
   *   </li>
   *   <li>
   *     <p>Append the node value to the last list in <code>levels</code>.</p>
   *   </li>
   *   <li>
   *     <p>Process recursively child nodes if they are not <code>None</code> :
   *       <code>helper(node.left / node.right, level + 1)</code>.</p>
   *   </li>
   * </ul>
   *
   * @param node  current node of the tree
   * @param level current level
   */
  public void helperV2(TreeNode node, int level) {
    // start the current level
    if (levels.size() == level) {
      levels.add(new ArrayList<>());
    }

    // fulfil the current level
    levels.get(level).add(node.val);

    // process child nodes for the next level
    if (node.left != null) {
      helperV2(node.left, level + 1);
    }
    if (node.right != null) {
      helperV2(node.right, level + 1);
    }
  }
}
