# Reverse Integer

## LeetCode Link
🔗 [Reverse Integer](https://leetcode.com/problems/reverse-integer)

## Difficulty
Medium

## Topics
- Math
- Integer Manipulation

## Acceptance Rate
29.73%

## Problem Statement
Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range [-2³¹, 2³¹ - 1], then return 0.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

## Examples
Example 1:
```
Input: x = 123
Output: 321
```

Example 2:
```
Input: x = -123
Output: -321
```

## Constraints
- -2³¹ <= x <= 2³¹ - 1
- Cannot use 64-bit integers in the solution

## Hints
<details>
<summary>Click here to see hints</summary>

1. Handle negative numbers by converting to positive first, then add the sign back at the end
2. Check for overflow before adding each digit to the result
3. Remember that integer overflow can occur during the reversal process

</details>
