# Binary Tree Right Side View

## LeetCode Link
🔗 [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view)

## Difficulty
Medium

## Topics
- Tree
- Depth-First Search
- Breadth-First Search
- Binary Tree

## Acceptance Rate
65.15%

## Problem Statement
Given the `root` of a binary tree, imagine yourself standing on the **right side** of it, return the values of the nodes you can see ordered from top to bottom.

## Examples
Example 1:
```
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
```

Example 2:
```
Input: root = [1,null,3]
Output: [1,3]
```

Example 3:
```
Input: root = []
Output: []
```

## Constraints
- The number of nodes in the tree is in the range [0, 100]
- -100 <= Node.val <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about level-order traversal (BFS)
2. For each level, we only need the rightmost node
3. Use a queue to process nodes level by level
4. Keep track of the size of each level to identify the rightmost node
5. Alternatively, you can use DFS with a preorder traversal (root->right->left)
   - Keep track of the current level
   - Only add a node to the result if we haven't seen a node at this level yet

</details>
