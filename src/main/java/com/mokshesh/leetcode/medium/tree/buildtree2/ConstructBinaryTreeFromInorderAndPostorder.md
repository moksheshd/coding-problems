# Construct Binary Tree from Inorder and Postorder Traversal

## LeetCode Link
🔗 [Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal)

## Difficulty
Medium

## Topics
- Array
- Tree
- Binary Tree
- Divide and Conquer

## Acceptance Rate
65.37%

## Problem Statement
Given two integer arrays `inorder` and `postorder` where `inorder` is the inorder traversal of a binary tree and `postorder` is the postorder traversal of the same tree, construct and return *the binary tree*.

## Examples
Example 1:
```
    3
   / \
  9  20
     / \
    15  7

Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
```

Example 2:
```
Input: inorder = [-1], postorder = [-1]
Output: [-1]
```

## Constraints
- 1 <= inorder.length <= 3000
- postorder.length == inorder.length
- -3000 <= inorder[i], postorder[i] <= 3000
- inorder and postorder consist of unique values
- Each value of postorder also appears in inorder
- inorder is guaranteed to be the inorder traversal of the tree
- postorder is guaranteed to be the postorder traversal of the tree

## Hints
<details>
<summary>Click here to see hints</summary>

1. The last element in postorder is always the root
2. Find the root's position in inorder to determine left and right subtrees
3. Recursively construct left and right subtrees
4. Keep track of array indices to avoid creating new arrays
5. Consider using a hash map to quickly find root positions in inorder array

</details>
