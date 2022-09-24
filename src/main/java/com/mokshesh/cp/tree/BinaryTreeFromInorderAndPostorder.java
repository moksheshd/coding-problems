package com.mokshesh.cp.tree;

import com.mokshesh.cp.helper.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 * </p>
 *   <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given the inorder and postorder traversal of a tree, construct the binary tree.</p>
 *     <p><strong>NOTE:</strong> You may assume that duplicates do not exist in the tree.</p>
 *   </div>
 *   <p><strong>Problem Constraints</strong><br>
 *   </p>
 *   <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= number of nodes &lt;= 10<sup>5</sup></p></div>
 *   <p><strong>Input Format</strong><br>
 *   </p>
 *   <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First argument is an integer array A denoting the inorder traversal of the tree.</p><p>Second argument is an integer array B denoting the postorder traversal of the tree.</p>
 *   </div>
 *   <p><strong>Output Format</strong><br>
 *   </p>
 *   <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the root node of the binary tree.</p></div>
 *   <p><strong>Example Input</strong><br>
 *   </p>
 *   <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p><pre> A = [2, 1, 3]
 *  B = [2, 3, 1]
 * </pre>
 *     <p>Input 2:</p>
 *     <pre> A = [6, 1, 3, 2]
 *  B = [6, 3, 2, 1]</pre>
 *   </div>
 *   <p><strong>Example Output</strong><br>
 *   </p>
 *   <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p><pre>   1
 *   / \
 *  2   3
 * </pre>
 *     <p>Output 2:</p>
 *     <pre>   1
 *   / \
 *  6   2
 *     /
 *    3</pre>
 *   </div>
 *   <p><strong>Example Explanation</strong><br>
 *   </p>
 *   <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p><pre> Create the binary tree and return the root node of the tree.</pre>
 *   </div>
 * </div>
 *
 * @link <a href="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">leetcode</a>
 * @level medium
 * @topic tree
 */
public class BinaryTreeFromInorderAndPostorder {
  Map<Integer, Integer> valueIndexMap = new HashMap<>();
  int postorderIndex;

  /**
   * <div class="content__QRGW"><div><h2>Solution</h2>
   * <hr>
   * <h4 id="how-to-traverse-the-tree">How to traverse the tree</h4>
   * <p>There are two general strategies to traverse a tree:</p>
   * <ul>
   * <li>
   * <p><em>Depth First Search</em> (<code>DFS</code>)</p>
   * <p>In this strategy, we adopt the <code>depth</code> as the priority, so that one
   * would start from a root and reach all the way down to certain leaf,
   * and then back to root to reach another branch.</p>
   * <p>The DFS strategy can further be distinguished as
   * <code>preorder</code>, <code>inorder</code>, and <code>postorder</code> depending on the relative order
   * among the root node, left node and right node.</p>
   * </li>
   * <li>
   * <p><em>Breadth First Search</em> (<code>BFS</code>)</p>
   * <p>We scan through the tree level by level, following the order of height,
   * from top to bottom. The nodes on higher level would be visited before
   * the ones with lower levels.</p>
   * </li>
   * </ul>
   * <p>On the following figure the nodes are enumerated in the order you visit them,
   * please follow <code>1-2-3-4-5</code> to compare different strategies.</p>
   * <p><img src="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/Figures/106/bfs_dfs.png" alt="postorder"></p>
   * <blockquote>
   * <p>In this problem one deals with inorder and postorder traversals.</p>
   * </blockquote>
   * <br>
   * <br>
   * <hr>
   * <h4 id="approach-1-recursion">Approach 1: Recursion</h4>
   * <p><strong>How to construct the tree from two traversals: inorder and preorder/postorder/etc</strong></p>
   * <p>Problems like this one are often at Facebook interviews, and could be solved in
   * <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi mathvariant="script">O</mi><mo>(</mo><mi>N</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">\mathcal{O}(N)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mord"><span class="mord mathcal" style="margin-right:0.02778em;">O</span></span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="mclose">)</span></span></span></span> time:</p>
   * <ul>
   * <li>
   * <p>Start from not inorder traversal, usually it's preorder or postorder one, and
   * use the traversal picture above to define the strategy to pick the nodes.
   * For example, for preorder traversal the <em>first</em> value is a root, then
   * its left child, then its right child, etc.
   * For postorder traversal the <em>last</em> value is a root, then its right child,
   * then its left child, etc.</p>
   * </li>
   * <li>
   * <p>The value picked from preorder/postorder traversal splits the inorder
   * traversal into left and right subtrees. The only information one needs from
   * inorder - if the current subtree is empty (= return <code>None</code>) or not
   * (= continue to construct the subtree).</p>
   * </li>
   * </ul>
   * <p><img src="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/Figures/106/recursion.png" alt="bla"></p>
   * <p><strong>Algorithm</strong></p>
   * <ul>
   * <li>
   * <p>Build hashmap <code>value -&gt; its index</code> for inorder traversal.</p>
   * </li>
   * <li>
   * <p>Return <code>helper</code> function which takes as the arguments: inorder, postorder,
   * the left boundaries for the current subtree in the inorder traversal,
   * the left boundaries for the current subtree in the inorder traversal and
   * current root node index from postorder
   * These boundaries are used only to check if the subtree is empty or not.
   * Here is how it works <code>helper(inorderLeftIndex = 0, inorderRightIndex = n - 1)</code>:</p>
   * <ul>
   * <li>
   * <p>If <code>inorderLeftIndex &gt; inorderRightIndex</code>, the subtree is empty, return <code>None</code>.</p>
   * </li>
   * <li>
   * <p>Pick the last element in postorder traversal as a root.</p>
   * </li>
   * <li>
   * <p>Root value has index <code>index</code> in the inorder traversal,
   * elements from <code>inorderLeftIndex</code> to <code>index - 1</code> belong to the left subtree,
   * and elements from <code>index + 1</code> to <code>inorderRightIndex</code> belong to the right subtree.</p>
   * </li>
   * <li>
   * <p>Following the postorder logic, proceed recursively first to construct the
   * right subtree <code>helper(index + 1, inorderRightIndex)</code> and then to construct
   * the left subtree <code>helper(inorderLeftIndex, index - 1)</code>.</p>
   * </li>
   * <li>
   * <p>Return <code>root</code>.</p>
   * </li>
   * </ul>
   * </li>
   * </ul>
   * <p><strong>Implementation</strong></p>
   * <p><strong>Complexity Analysis</strong></p>
   * <ul>
   * <li>
   * <p>Time complexity : <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi mathvariant="script">O</mi><mo>(</mo><mi>N</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">\mathcal{O}(N)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mord"><span class="mord mathcal" style="margin-right:0.02778em;">O</span></span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="mclose">)</span></span></span></span>. Let's compute the solution with the help of
   * <a href="https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)" rel="ugc">master theorem</a>
   * <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>T</mi><mo>(</mo><mi>N</mi><mo>)</mo><mo>=</mo><mi>a</mi><mi>T</mi><mrow><mo fence="true">(</mo><mfrac><mi>b</mi><mi>N</mi></mfrac><mo fence="true">)</mo></mrow><mo>+</mo><mi mathvariant="normal">Θ</mi><mo>(</mo><msup><mi>N</mi><mi>d</mi></msup><mo>)</mo></mrow><annotation encoding="application/x-tex">T(N) = aT\left(\frac{b}{N}\right) + \Theta(N^d)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mord mathdefault" style="margin-right:0.13889em;">T</span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="mclose">)</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span></span><span class="base"><span class="strut" style="height:1.2301179999999998em;vertical-align:-0.35001em;"></span><span class="mord mathdefault">a</span><span class="mord mathdefault" style="margin-right:0.13889em;">T</span><span class="mspace" style="margin-right:0.16666666666666666em;"></span><span class="minner"><span class="mopen delimcenter" style="top:0em;"><span class="delimsizing size1">(</span></span><span class="mord"><span class="mopen nulldelimiter"></span><span class="mfrac"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height:0.8801079999999999em;"><span style="top:-2.6550000000000002em;"><span class="pstrut" style="height:3em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight" style="margin-right:0.10903em;">N</span></span></span></span><span style="top:-3.23em;"><span class="pstrut" style="height:3em;"></span><span class="frac-line" style="border-bottom-width:0.04em;"></span></span><span style="top:-3.394em;"><span class="pstrut" style="height:3em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight">b</span></span></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height:0.345em;"><span></span></span></span></span></span><span class="mclose nulldelimiter"></span></span><span class="mclose delimcenter" style="top:0em;"><span class="delimsizing size1">)</span></span></span><span class="mspace" style="margin-right:0.2222222222222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right:0.2222222222222222em;"></span></span><span class="base"><span class="strut" style="height:1.099108em;vertical-align:-0.25em;"></span><span class="mord">Θ</span><span class="mopen">(</span><span class="mord"><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height:0.849108em;"><span style="top:-3.063em;margin-right:0.05em;"><span class="pstrut" style="height:2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mathdefault mtight">d</span></span></span></span></span></span></span></span><span class="mclose">)</span></span></span></span>.
   * The equation represents dividing the problem
   * up into <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>a</mi></mrow><annotation encoding="application/x-tex">a</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:0.43056em;vertical-align:0em;"></span><span class="mord mathdefault">a</span></span></span></span> subproblems of size <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mfrac><mi>N</mi><mi>b</mi></mfrac></mrow><annotation encoding="application/x-tex">\frac{N}{b}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1.217331em;vertical-align:-0.345em;"></span><span class="mord"><span class="mopen nulldelimiter"></span><span class="mfrac"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height:0.872331em;"><span style="top:-2.6550000000000002em;"><span class="pstrut" style="height:3em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight">b</span></span></span></span><span style="top:-3.23em;"><span class="pstrut" style="height:3em;"></span><span class="frac-line" style="border-bottom-width:0.04em;"></span></span><span style="top:-3.394em;"><span class="pstrut" style="height:3em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight" style="margin-right:0.10903em;">N</span></span></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height:0.345em;"><span></span></span></span></span></span><span class="mclose nulldelimiter"></span></span></span></span></span> in <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi mathvariant="normal">Θ</mi><mo>(</mo><msup><mi>N</mi><mi>d</mi></msup><mo>)</mo></mrow><annotation encoding="application/x-tex">\Theta(N^d)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1.099108em;vertical-align:-0.25em;"></span><span class="mord">Θ</span><span class="mopen">(</span><span class="mord"><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height:0.849108em;"><span style="top:-3.063em;margin-right:0.05em;"><span class="pstrut" style="height:2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mathdefault mtight">d</span></span></span></span></span></span></span></span><span class="mclose">)</span></span></span></span> time.
   * Here one divides the problem in two subproblemes <code>a = 2</code>, the size of each subproblem
   * (to compute left and right subtree) is a half of initial problem <code>b = 2</code>,
   * and all this happens in a constant time <code>d = 0</code>.
   * That means that <span class="katex"><span class="katex-mathml"><math><semantics><mrow><msub><mi>log</mi><mo>⁡</mo><mi>b</mi></msub><mo>(</mo><mi>a</mi><mo>)</mo><mo>&gt;</mo><mi>d</mi></mrow><annotation encoding="application/x-tex">\log_b(a) &gt; d</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mop"><span class="mop">lo<span style="margin-right:0.01389em;">g</span></span><span class="msupsub"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height:0.24196799999999993em;"><span style="top:-2.4558600000000004em;margin-right:0.05em;"><span class="pstrut" style="height:2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mathdefault mtight">b</span></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height:0.24414em;"><span></span></span></span></span></span></span><span class="mopen">(</span><span class="mord mathdefault">a</span><span class="mclose">)</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span><span class="mrel">&gt;</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span></span><span class="base"><span class="strut" style="height:0.69444em;vertical-align:0em;"></span><span class="mord mathdefault">d</span></span></span></span> and hence we're dealing with
   * <a href="https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)#Case_1_example" rel="ugc">case 1</a>
   * that means <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi mathvariant="script">O</mi><mo>(</mo><msup><mi>N</mi><mrow><msub><mi>log</mi><mo>⁡</mo><mi>b</mi></msub><mo>(</mo><mi>a</mi><mo>)</mo></mrow></msup><mo>)</mo><mo>=</mo><mi mathvariant="script">O</mi><mo>(</mo><mi>N</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">\mathcal{O}(N^{\log_b(a)}) = \mathcal{O}(N)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1.138em;vertical-align:-0.25em;"></span><span class="mord"><span class="mord mathcal" style="margin-right:0.02778em;">O</span></span><span class="mopen">(</span><span class="mord"><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height:0.8879999999999999em;"><span style="top:-3.063em;margin-right:0.05em;"><span class="pstrut" style="height:2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mop mtight"><span class="mop mtight">lo<span style="margin-right:0.01389em;">g</span></span><span class="msupsub"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height:0.23015999999999992em;"><span style="top:-2.2341314285714287em;margin-right:0.07142857142857144em;"><span class="pstrut" style="height:2.5em;"></span><span class="sizing reset-size3 size1 mtight"><span class="mord mathdefault mtight">b</span></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height:0.26586857142857145em;"><span></span></span></span></span></span></span><span class="mopen mtight">(</span><span class="mord mathdefault mtight">a</span><span class="mclose mtight">)</span></span></span></span></span></span></span></span></span><span class="mclose">)</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right:0.2777777777777778em;"></span></span><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mord"><span class="mord mathcal" style="margin-right:0.02778em;">O</span></span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="mclose">)</span></span></span></span> time complexity.</p>
   * </li>
   * <li>
   * <p>Space complexity : <span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi mathvariant="script">O</mi><mo>(</mo><mi>N</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">\mathcal{O}(N)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height:1em;vertical-align:-0.25em;"></span><span class="mord"><span class="mord mathcal" style="margin-right:0.02778em;">O</span></span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right:0.10903em;">N</span><span class="mclose">)</span></span></span></span>, since we store the entire tree.</p>
   * </li>
   * </ul>
   * </div></div>
   *
   * @param inorder   inorder traversal
   * @param postorder postorder traversal
   * @return root node
   */
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    this.postorderIndex = postorder.length - 1;
    for (int i = 0; i < inorder.length; i++) {
      this.valueIndexMap.put(inorder[i], i);
    }
    return helper(inorder, postorder, 0, inorder.length - 1);
  }

  /* Manifestation or Assumption */
  TreeNode helper(int[] inorder, int[] postorder, int inorderLeftIndex, int inorderRightIndex) {
    /* Base condition */
    if (inorderLeftIndex > inorderRightIndex) {
      return null;
    }

    /* Main logic */
    // Pick up postorderIndex as the root element
    int value = postorder[postorderIndex];
    TreeNode root = new TreeNode(value);

    // Get the index of the root element from the inorder and split to Left Sub Tree (LST) and Right Sub Tree (RST)
    int index = valueIndexMap.get(value);

    postorderIndex--;
    root.right = helper(inorder, postorder, index + 1, inorderRightIndex);
    root.left = helper(inorder, postorder, inorderLeftIndex, index - 1);

    return root;
  }
}
