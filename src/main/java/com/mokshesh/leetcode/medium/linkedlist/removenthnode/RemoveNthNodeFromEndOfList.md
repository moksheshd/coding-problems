# Remove Nth Node From End of List

## LeetCode Link
🔗 [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list)

## Difficulty
Medium

## Topics
- Linked List
- Two Pointers

## Acceptance Rate
47.83%

## Problem Statement
Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

## Examples
Example 1:
![Remove Nth Node Example](https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg)
```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

Example 2:
```
Input: head = [1], n = 1
Output: []
```

Example 3:
```
Input: head = [1,2], n = 1
Output: [1]
```

## Constraints
- The number of nodes in the list is sz
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

## Hints
<details>
<summary>Click here to see hints</summary>

1. Maintain two pointers and update one with a delay of n steps
2. Use a dummy head to handle edge cases where the first node needs to be removed
3. The first pointer should be n steps ahead of the second pointer
4. When the first pointer reaches the end, the second pointer will be at the node before the one to be removed

</details>
