# Factorial Trailing Zeroes

## LeetCode Link
🔗 [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes)

## Difficulty
Medium

## Topics
- Math

## Acceptance Rate
44.35%

## Problem Statement
Given an integer `n`, return the number of trailing zeroes in `n!`.

Note that `n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1`.

## Examples
Example 1:
```
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
```

Example 2:
```
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
```

Example 3:
```
Input: n = 0
Output: 0
```

## Constraints
- 0 <= n <= 10^4

## Hints
<details>
<summary>Click here to see hints</summary>

1. A trailing zero is always produced by prime factors 2 and 5.
2. If we can count the number of 5s and 2s, our task is done.
3. Since 2s are always more than 5s in a factorial, we only need to count 5s.
4. How to count the 5s? First, we count the numbers that contribute one 5, then numbers that contribute two 5s, and so on.

</details>
