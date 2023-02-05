# Binary Tree Level Order Traversal

## LeetCode Link
🔗 [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Breadth-First Search

## Acceptance Rate
69.54%

## Problem Statement
Given the `root` of a binary tree, return *the level order traversal of its nodes' values* (i.e., from left to right, level by level).

## Examples
Example 1:
```
    3
   / \
  9  20
     / \
    15  7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
```

Example 2:
```
Input: root = [1]
Output: [[1]]
```

Example 3:
```
Input: root = []
Output: []
```

## Constraints
- The number of nodes in the tree is in the range [0, 2000]
- -1000 <= Node.val <= 1000

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a queue to store nodes at each level
2. Process nodes level by level using the queue size
3. For each level, create a new list to store values
4. Add left and right children to queue for next level
5. Keep track of current level's nodes using queue size

</details>
