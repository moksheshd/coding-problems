# Unique Binary Search Trees II

## LeetCode Link
🔗 [Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii)

## Difficulty
Medium

## Topics
- Dynamic Programming
- Tree
- Binary Search Tree
- Backtracking

## Acceptance Rate
59.52%

## Problem Statement
Given an integer `n`, return *all the structurally unique BST's (binary search trees), which has exactly `n` nodes of unique values from `1` to `n`*. Return the answer in **any order**.

A binary search tree (BST) is a binary tree where for each node:
- All nodes in its left subtree have values less than the node's value
- All nodes in its right subtree have values greater than the node's value

## Examples
Example 1:
```
Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
```

Example 2:
```
Input: n = 1
Output: [[1]]
```

## Constraints
- 1 <= n <= 8

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider using recursion to generate all possible BSTs
2. For each value i from 1 to n, consider it as the root
3. Recursively generate all possible left subtrees with values less than i
4. Recursively generate all possible right subtrees with values greater than i
5. Combine each left subtree with each right subtree to form complete BSTs

</details>
