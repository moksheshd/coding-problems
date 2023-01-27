# Insertion Sort List

## LeetCode Link
🔗 [Insertion Sort List](https://leetcode.com/problems/insertion-sort-list)

## Difficulty
Medium

## Topics
- Linked List
- Sorting

## Acceptance Rate
55.56%

## Problem Statement
Given the `head` of a singly linked list, sort the list using insertion sort, and return the sorted list's head.

The steps of the insertion sort algorithm:
1. Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
2. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
3. It repeats until no input elements remain.

## Examples
Example 1:
```
Input: head = [4,2,1,3]
Output: [1,2,3,4]
```

Example 2:
```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
```

## Constraints
- The number of nodes in the list is in the range [1, 5000]
- -5000 <= Node.val <= 5000

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about maintaining a sorted portion of the list.
2. For each node, find its correct position in the sorted portion.
3. Carefully handle pointer updates when inserting a node.

</details>
