# Kth Smallest Element in a BST

## LeetCode Link
🔗 [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst)

## Difficulty
Medium

## Topics
- Tree
- Binary Search Tree
- Binary Tree
- Depth-First Search

## Acceptance Rate
74.51%

## Problem Statement
Given the `root` of a binary search tree, and an integer `k`, return the `kth` smallest value (1-indexed) of all the values of the nodes in the tree.

## Examples
Example 1:
```
Input: root = [3,1,4,null,2], k = 1
Output: 1
```

Example 2:
```
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
```

## Constraints
- The number of nodes in the tree is `n`.
- `1 <= k <= n <= 10^4`
- `0 <= Node.val <= 10^4`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try to utilize the property of a BST.
2. Try in-order traversal.
3. What if you could modify the BST node's structure?
4. The optimal runtime complexity is O(H + k), where H is the height of the tree.

</details>
