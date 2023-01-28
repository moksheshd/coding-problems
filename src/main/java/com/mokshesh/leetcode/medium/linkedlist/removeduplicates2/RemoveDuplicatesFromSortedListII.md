# Remove Duplicates from Sorted List II

## LeetCode Link
🔗 [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii)

## Difficulty
Medium

## Topics
- Linked List
- Two Pointers

## Acceptance Rate
49.05%

## Problem Statement
Given the `head` of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list **sorted** as well.

## Examples
Example 1:
```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
```

Example 2:
```
Input: head = [1,1,1,2,3]
Output: [2,3]
```

## Constraints
- The number of nodes in the list is in the range [0, 300]
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a dummy head to handle cases where the first nodes are duplicates
2. Keep track of the previous node while traversing
3. When finding duplicates, skip all nodes with the same value
4. Only move the previous pointer when we're sure the current node should be kept

</details>
