# Path Sum II

## LeetCode Link
🔗 [Path Sum II](https://leetcode.com/problems/path-sum-ii)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Depth-First Search
- Backtracking

## Acceptance Rate
59.88%

## Problem Statement
Given the `root` of a binary tree and an integer `targetSum`, return *all **root-to-leaf** paths where the sum of the node values in the path equals* `targetSum`. Each path should be returned as a list of the node values, not node references.

A **root-to-leaf** path is a path starting from the root and ending at any leaf node. A **leaf** is a node with no children.

## Examples
Example 1:
```
    5
   / \
  4   8
 /   / \
11  13  4
/  \    / \
7   2  5   1

Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
```

Example 2:
```
Input: root = [1,2,3], targetSum = 5
Output: []
```

Example 3:
```
Input: root = [1,2], targetSum = 0
Output: []
```

## Constraints
- The number of nodes in the tree is in the range [0, 5000]
- -1000 <= Node.val <= 1000
- -1000 <= targetSum <= 1000

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use DFS to traverse all paths from root to leaf
2. Keep track of current path and sum while traversing
3. When reaching a leaf node, check if sum equals target
4. Use backtracking to try all possible paths
5. Remember to remove nodes from current path when backtracking

</details>
