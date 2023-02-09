# Validate Binary Search Tree

## LeetCode Link
🔗 [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree)

## Difficulty
Medium

## Topics
- Tree
- Binary Search Tree
- Depth-First Search
- Binary Tree

## Acceptance Rate
33.86%

## Problem Statement
Given the `root` of a binary tree, determine if it is a valid binary search tree (BST).

A **valid BST** is defined as follows:
- The left subtree of a node contains only nodes with keys **less than** the node's key.
- The right subtree of a node contains only nodes with keys **greater than** the node's key.
- Both the left and right subtrees must also be binary search trees.

## Examples
Example 1:
```
    2
   / \
  1   3

Input: root = [2,1,3]
Output: true
```

Example 2:
```
    5
   / \
  1   4
     / \
    3   6

Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
```

## Constraints
- The number of nodes in the tree is in the range [1, 10⁴]
- -2³¹ <= Node.val <= 2³¹ - 1

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use recursion to validate each subtree
2. Keep track of valid ranges for each node
3. For the left subtree, the maximum value should be less than the current node's value
4. For the right subtree, the minimum value should be greater than the current node's value
5. Consider using Long.MIN_VALUE and Long.MAX_VALUE for initial range bounds to handle edge cases

</details>
