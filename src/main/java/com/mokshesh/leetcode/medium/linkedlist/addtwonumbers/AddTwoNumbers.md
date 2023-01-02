# Add Two Numbers

## LeetCode Link
🔗 [Add Two Numbers](https://leetcode.com/problems/add-two-numbers)

## Difficulty
Medium

## Topics
- Linked List
- Math
- Recursion

## Acceptance Rate
45.18%

## Problem Statement
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Examples
```
Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Constraints
- The number of nodes in each linked list is in the range `[1, 100]`
- `0 <= Node.val <= 9`
- It is guaranteed that the list represents a number that does not have leading zeros

## Hints
<details>
<summary>Click here to see hints</summary>

1. Keep track of the carry using a variable and simulate digits-by-digits sum starting from the head of list
2. Just like how you would sum two numbers on a paper: start from the rightmost digit and move towards left
3. Make sure to handle cases where the lists have different lengths

</details>
