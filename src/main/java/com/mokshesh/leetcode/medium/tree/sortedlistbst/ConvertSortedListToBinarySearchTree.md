# Convert Sorted List to Binary Search Tree

## LeetCode Link
🔗 [Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree)

## Difficulty
Medium

## Topics
- Linked List
- Tree
- Binary Search Tree
- Divide and Conquer

## Acceptance Rate
63.66%

## Problem Statement
Given the `head` of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

## Examples
Example 1:
```
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
```

Example 2:
```
Input: head = []
Output: []
```

## Constraints
- The number of nodes in `head` is in the range [0, 2 * 10^4]
- -10^5 <= Node.val <= 10^5

## Hints
<details>
<summary>Click here to see hints</summary>

1. The middle element of the linked list should be the root
2. Find the middle element using slow and fast pointer technique
3. Recursively construct left and right subtrees
4. Break the linked list into two parts at the middle
5. Consider using a global pointer to traverse the linked list

</details>
