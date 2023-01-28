# Linked List Cycle II

## LeetCode Link
🔗 [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii)

## Difficulty
Medium

## Topics
- Hash Table
- Linked List
- Two Pointers

## Acceptance Rate
53.70%

## Problem Statement
Given the `head` of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to (0-indexed). It is `-1` if there is no cycle. Note that `pos` is not passed as a parameter.

Do not modify the linked list.

## Examples
Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```

Example 2:
```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```

Example 3:
```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

## Constraints
- The number of the nodes in the list is in the range [0, 10^4]
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked-list

## Hints
<details>
<summary>Click here to see hints</summary>

1. Can you solve it using O(1) (i.e. constant) memory?
2. Use two pointers, one moving twice as fast as the other one.
3. The fast pointer will eventually catch up to the slow pointer if there is a cycle.
4. When they meet, reset one pointer to the head and move both at the same speed. The point where they meet again is the start of the cycle.

</details>
