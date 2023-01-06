# Divide Two Integers

## LeetCode Link
🔗 [Divide Two Integers](https://leetcode.com/problems/divide-two-integers)

## Difficulty
Medium

## Topics
- Math
- Bit Manipulation

## Acceptance Rate
18.05%

## Problem Statement
Given two integers `dividend` and `divisor`, divide two integers **without** using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example:
- 8.345 would be truncated to 8
- -2.7335 would be truncated to -2

Return *the quotient* after dividing `dividend` by `divisor`.

**Note:** Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [-2³¹, 2³¹ - 1]. For this problem:
- If the quotient is strictly greater than 2³¹ - 1, then return 2³¹ - 1
- If the quotient is strictly less than -2³¹, then return -2³¹

## Examples
Example 1:
```
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333... which is truncated to 3.
```

Example 2:
```
Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333... which is truncated to -2.
```

## Constraints
- -2³¹ <= dividend, divisor <= 2³¹ - 1
- divisor != 0

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use bit manipulation to simulate division
2. Keep subtracting the divisor from the dividend until you can't anymore
3. Use bit shifting to optimize the subtraction process
4. Handle edge cases like overflow and negative numbers carefully
5. Consider using long to handle intermediate calculations

</details>
