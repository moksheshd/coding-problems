# Count Univalue Subtrees

## LeetCode Link
🔗 [Count Univalue Subtrees](https://leetcode.com/problems/count-univalue-subtrees)

## Difficulty
Medium

## Topics
- Tree
- Depth-First Search
- Binary Tree

## Acceptance Rate
56.89%

## Problem Statement
Given the root of a binary tree, return the number of uni-value subtrees.

A uni-value subtree means all nodes of the subtree have the same value.

## Examples
Example 1:
```
Input: root = [5,1,5,5,5,null,5]
Output: 4
```

Example 2:
```
Input: root = []
Output: 0
```

Example 3:
```
Input: root = [5,5,5,5,5,null,5]
Output: 6
```

## Constraints
- The number of the node in the tree will be in the range `[0, 1000]`
- `-1000 <= Node.val <= 1000`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a recursive approach to solve this problem.
2. For each node, check if its subtree is a uni-value subtree.
3. A subtree is uni-value if:
   - The node has no children (leaf node)
   - The node has one child and that child's subtree is uni-value with same value as node
   - The node has two children and both children's subtrees are uni-value with same value as node
4. Keep track of the count as you traverse the tree.

</details>
