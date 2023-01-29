# Partition List

## LeetCode Link
🔗 [Partition List](https://leetcode.com/problems/partition-list)

## Difficulty
Medium

## Topics
- Linked List
- Two Pointers

## Acceptance Rate
58.07%

## Problem Statement
Given the `head` of a linked list and a value `x`, partition it such that all nodes **less than** `x` come before nodes **greater than or equal** to `x`.

You should **preserve** the original relative order of the nodes in each of the two partitions.

## Examples
Example 1:
```
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
```

Example 2:
```
Input: head = [2,1], x = 2
Output: [1,2]
```

## Constraints
- The number of nodes in the list is in the range [0, 200]
- -100 <= Node.val <= 100
- -200 <= x <= 200

## Hints
<details>
<summary>Click here to see hints</summary>

1. Create two separate linked lists: one for nodes less than x and one for nodes greater than or equal to x
2. Traverse the original list and add each node to the appropriate new list
3. Connect the two lists at the end
4. Remember to handle edge cases like empty lists or when all nodes are in one partition

</details>
