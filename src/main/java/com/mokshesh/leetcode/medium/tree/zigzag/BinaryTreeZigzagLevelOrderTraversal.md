# Binary Tree Zigzag Level Order Traversal

## LeetCode Link
🔗 [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Breadth-First Search

## Acceptance Rate
60.79%

## Problem Statement
Given the `root` of a binary tree, return *the zigzag level order traversal of its nodes' values* (i.e., from left to right, then right to left for the next level and alternate between).

## Examples
Example 1:
```
    3
   / \
  9  20
     / \
    15  7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
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
- -100 <= Node.val <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a queue to store nodes at each level
2. Keep track of current level number to determine traversal direction
3. For even levels, traverse left to right
4. For odd levels, traverse right to left
5. Use a deque or reverse the level list based on level number

</details>
