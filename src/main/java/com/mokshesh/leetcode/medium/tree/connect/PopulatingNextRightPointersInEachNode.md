# Populating Next Right Pointers in Each Node

## LeetCode Link
🔗 [Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node)

## Difficulty
Medium

## Topics
- Tree
- Binary Tree
- Depth-First Search
- Breadth-First Search
- Binary Search Tree

## Acceptance Rate
64.61%

## Problem Statement
You are given a **perfect binary tree** where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

```java
struct Node {
    int val;
    Node *left;
    Node *right;
    Node *next;
}
```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

## Examples
Example 1:
```
     1             1 -> NULL
   /  \          /  \
  2    3        2 -> 3 -> NULL
 / \  / \      / \  / \
4  5 6   7    4->5->6->7 -> NULL

Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
Explanation: Given the above perfect binary tree, your function should populate each next pointer to point to its next right node. The serialized output is [1,#,2,3,#,4,5,6,7,#] where # signifies NULL.
```

Example 2:
```
Input: root = []
Output: []
```

## Constraints
- The number of nodes in the tree is in the range [0, 2¹² - 1]
- -1000 <= Node.val <= 1000

## Follow-up
- You may only use constant extra space.
- The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you can use the next pointer to establish connections between nodes at different levels
2. The next pointer allows you to traverse the tree horizontally
3. Process the tree level by level, connecting nodes at each level
4. Use previously established next pointers to help connect nodes at the current level
5. Consider both recursive and iterative approaches

</details>
