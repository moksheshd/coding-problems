# Recover Binary Search Tree

## LeetCode Link
🔗 [Recover Binary Search Tree](https://leetcode.com/problems/recover-binary-search-tree)

## Difficulty
Medium

## Topics
- Tree
- Binary Search Tree
- Depth-First Search
- Binary Tree

## Acceptance Rate
55.23%

## Problem Statement
You are given the `root` of a binary search tree (BST), where exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.

## Examples
Example 1:
```
    1
   /
  3
   \
    2

Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 will restore the BST property.
```

Example 2:
```
    3
   /
  1
   \
    4
     \
      2

Input: root = [3,1,4,null,null,2]
Output: [2,1,4,null,null,3]
Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 will restore the BST property.
```

## Constraints
- The number of nodes in the tree is in the range [2, 1000]
- -2³¹ <= Node.val <= 2³¹ - 1

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how the inorder traversal of a BST should look like
2. The inorder traversal of a BST should be in ascending order
3. When two nodes are swapped, there will be two positions in the inorder traversal where the values are out of order
4. Keep track of these positions during the traversal
5. Once found, swap the values back to restore the BST property

</details>
