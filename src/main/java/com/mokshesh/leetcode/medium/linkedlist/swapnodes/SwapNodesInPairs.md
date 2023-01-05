# Swap Nodes in Pairs

## LeetCode Link
🔗 [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs)

## Difficulty
Medium

## Topics
- Linked List
- Recursion

## Acceptance Rate
66.29%

## Problem Statement
Given a linked list, swap every two adjacent nodes and return its head.

You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

## Examples
Example 1:
![Swap Nodes Example](https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg)
```
Input: head = [1,2,3,4]
Output: [2,1,4,3]
```

Example 2:
```
Input: head = []
Output: []
```

Example 3:
```
Input: head = [1]
Output: [1]
```

## Constraints
- The number of nodes in the list is in the range [0, 100]
- 0 <= Node.val <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a dummy head to handle edge cases where the first node needs to be swapped
2. Keep track of three pointers: previous, current, and next
3. For each pair, adjust the pointers to swap the nodes
4. Be careful about updating the next pointers correctly
5. Consider both iterative and recursive approaches

</details>
