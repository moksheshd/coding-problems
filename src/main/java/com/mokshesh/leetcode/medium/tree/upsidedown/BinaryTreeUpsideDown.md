# Binary Tree Upside Down

## LeetCode Link
🔗 [Binary Tree Upside Down](https://leetcode.com/problems/binary-tree-upside-down)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Depth-First Search

## Acceptance Rate
63.90%

## Problem Statement
Given the root of a binary tree, turn the tree upside down and return the new root.

You can turn a binary tree upside down with the following steps:
1. The original left child becomes the new root.
2. The original root becomes the new right child.
3. The original right child becomes the new left child.

The upside-down binary tree from the original tree looks like this:
```
     1                 1
    / \               / \
   2   3     =>     2   3
  / \               / \
 4   5             4   5
```
becomes:
```
     4
    / \
   5   2
      / \
     3   1
```

## Examples
Example 1:
```
Input: root = [1,2,3,4,5]
Output: [4,5,2,null,null,3,1]
```

Example 2:
```
Input: root = []
Output: []
```

Example 3:
```
Input: root = [1]
Output: [1]
```

## Constraints
- The number of nodes in the tree will be in the range [0, 10]
- 1 <= Node.val <= 10
- Every right node in the tree has a sibling (a left node that shares the same parent)
- Every right node in the tree has no children

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to handle the left and right children of each node.
2. The key is to keep track of the parent node while traversing down the tree.
3. Consider using recursion to solve this problem.

</details>
