# Verify Preorder Sequence in Binary Search Tree

## LeetCode Link
🔗 [Verify Preorder Sequence in Binary Search Tree](https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree)

## Difficulty
Medium

## Topics
- Tree
- Binary Search Tree
- Stack
- Monotonic Stack

## Acceptance Rate
50.58%

## Problem Statement
Given an array of numbers, verify whether it is the correct preorder traversal sequence of a binary search tree.

You may assume each number in the sequence is unique.

Consider the following binary search tree:
```
     5
    / \
   2   6
  / \
 1   3
```

## Examples
Example 1:
```
Input: [5,2,1,3,6]
Output: true
```

Example 2:
```
Input: [5,2,6,1,3]
Output: false
```

## Constraints
- `1 <= preorder.length <= 10^4`
- `-10^4 <= preorder[i] <= 10^4`
- All the elements of `preorder` are unique.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about the properties of preorder traversal in a BST.
2. In a BST, for any node, all nodes in its left subtree are smaller and all nodes in its right subtree are larger.
3. When we move to a right subtree, we should never see a smaller value again.
4. Consider using a stack to track the path and maintain a minimum value.

</details>
