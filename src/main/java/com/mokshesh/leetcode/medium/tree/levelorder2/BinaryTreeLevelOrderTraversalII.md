# Binary Tree Level Order Traversal II

## LeetCode Link
🔗 [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Breadth-First Search

## Acceptance Rate
65.17%

## Problem Statement
Given the `root` of a binary tree, return *the bottom-up level order traversal of its nodes' values* (i.e., from left to right, level by level from leaf to root).

## Examples
Example 1:
```
    3
   / \
  9  20
     / \
    15  7

Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
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
2. Process nodes level by level
3. Store each level's values in a list
4. Reverse the final list of levels to get bottom-up order
5. Consider using a deque for more efficient list reversal

</details>
