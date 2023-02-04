# Flatten Binary Tree to Linked List

## LeetCode Link
🔗 [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Depth-First Search
- Stack
- Linked List

## Acceptance Rate
67.42%

## Problem Statement
Given the `root` of a binary tree, flatten the tree into a "linked list":

- The "linked list" should use the same `TreeNode` class where the `right` child pointer points to the next node in the list and the `left` child pointer is always `null`.
- The "linked list" should be in the same order as a pre-order traversal of the binary tree.

## Examples
Example 1:
```
    1
   / \
  2   5
 / \   \
3   4   6

After flattening:
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```

Example 2:
```
Input: root = []
Output: []
```

Example 3:
```
Input: root = [0]
Output: [0]
```

## Constraints
- The number of nodes in the tree is in the range [0, 2000]
- -100 <= Node.val <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you can maintain the order of nodes during flattening
2. Consider using pre-order traversal to get the correct order
3. You can solve this recursively or iteratively
4. For recursive solution, think about how to handle the right subtree
5. For iterative solution, consider using a stack to store nodes

</details>
