# Rotate List

## LeetCode Link
🔗 [Rotate List](https://leetcode.com/problems/rotate-list)

## Difficulty
Medium

## Topics
- Linked List
- Two Pointers

## Acceptance Rate
39.22%

## Problem Statement
Given the `head` of a linked list, rotate the list to the right by `k` places.

## Examples
Example 1:
```
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
```

Example 2:
```
Input: head = [0,1,2], k = 4
Output: [2,0,1]
```

## Constraints
- The number of nodes in the list is in the range [0, 500]
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 10⁹

## Hints
<details>
<summary>Click here to see hints</summary>

1. Find the length of the linked list
2. Handle the case when k is larger than the length by using k % length
3. Connect the last node to the first node to make it circular
4. Find the new head and break the connection at appropriate point
5. Remember to handle edge cases (empty list, single node, k = 0)

</details>
