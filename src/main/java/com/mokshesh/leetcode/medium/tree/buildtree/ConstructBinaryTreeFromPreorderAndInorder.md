# Construct Binary Tree from Preorder and Inorder Traversal

## LeetCode Link
🔗 [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal)

## Difficulty
Medium

## Topics
- Array
- Tree
- Binary Tree
- Divide and Conquer

## Acceptance Rate
65.88%

## Problem Statement
Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return *the binary tree*.

## Examples
Example 1:
```
    3
   / \
  9  20
     / \
    15  7

Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

Example 2:
```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```

## Constraints
- 1 <= preorder.length <= 3000
- inorder.length == preorder.length
- -3000 <= preorder[i], inorder[i] <= 3000
- preorder and inorder consist of unique values
- Each value of inorder also appears in preorder
- preorder is guaranteed to be the preorder traversal of the tree
- inorder is guaranteed to be the inorder traversal of the tree

## Hints
<details>
<summary>Click here to see hints</summary>

1. The first element in preorder is always the root
2. Find the root's position in inorder to determine left and right subtrees
3. Recursively construct left and right subtrees
4. Keep track of array indices to avoid creating new arrays
5. Consider using a hash map to quickly find root positions in inorder array

</details>
