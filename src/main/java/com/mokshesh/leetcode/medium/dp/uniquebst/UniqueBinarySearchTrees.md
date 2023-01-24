# Unique Binary Search Trees

## LeetCode Link
🔗 [Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees)

## Difficulty
Medium

## Topics
- Dynamic Programming
- Math
- Tree
- Binary Search Tree

## Acceptance Rate
62.04%

## Problem Statement
Given an integer `n`, return *the number of structurally unique BST's (binary search trees) which has exactly `n` nodes of unique values from `1` to `n`*.

## Examples
Example 1:
```
Input: n = 3
Output: 5
Explanation: The 5 unique BSTs are:
   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```

Example 2:
```
Input: n = 1
Output: 1
```

## Constraints
- 1 <= n <= 19

## Hints
<details>
<summary>Click here to see hints</summary>

1. The problem can be solved using dynamic programming
2. For each number i from 1 to n, consider it as the root
3. The left subtree will contain numbers from 1 to i-1
4. The right subtree will contain numbers from i+1 to n
5. The total number of unique BSTs is the product of unique left and right subtrees

</details>
