# Lowest Common Ancestor of a Binary Tree

## LeetCode Link
🔗 [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Depth-First Search

## Acceptance Rate
65.31%

## Problem Statement
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow a node to be a descendant of itself)."

## Examples
Example 1:
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
```

Example 2:
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
```

## Constraints
- The number of nodes in the tree is in the range `[2, 10^5]`.
- `-10^9 <= Node.val <= 10^9`
- All `Node.val` are unique.
- `p != q`
- `p` and `q` will exist in the tree.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you would find the LCA in a binary tree where nodes don't have parent pointers.
2. Try using recursion to traverse the tree.
3. The LCA would be the first node you encounter that has p and q in different subtrees (or is one of p or q itself).
4. A node can be a descendant of itself.

</details>
