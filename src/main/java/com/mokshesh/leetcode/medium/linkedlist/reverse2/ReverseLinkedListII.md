# Reverse Linked List II

## LeetCode Link
🔗 [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii)

## Difficulty
Medium

## Topics
- Linked List

## Acceptance Rate
48.91%

## Problem Statement
Given the `head` of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position `left` to position `right`, and return *the reversed list*.

## Examples
Example 1:
```
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
```

Example 2:
```
Input: head = [5], left = 1, right = 1
Output: [5]
```

## Constraints
- The number of nodes in the list is n
- 1 <= n <= 500
- -500 <= Node.val <= 500
- 1 <= left <= right <= n

## Hints
<details>
<summary>Click here to see hints</summary>

1. Break down the problem into steps:
   - Find the node at position 'left'
   - Reverse the nodes from 'left' to 'right'
   - Connect the reversed portion back to the rest of the list
2. Keep track of the node before the reversal starts
3. Use multiple pointers to handle the reversal
4. Consider edge cases where left = 1 or right = n

</details>
