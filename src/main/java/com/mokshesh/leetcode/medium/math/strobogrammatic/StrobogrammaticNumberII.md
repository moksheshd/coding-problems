# Strobogrammatic Number II

## LeetCode Link
🔗 [Strobogrammatic Number II](https://leetcode.com/problems/strobogrammatic-number-ii)

## Difficulty
Medium

## Topics
- Math
- Recursion
- String

## Acceptance Rate
52.83%

## Problem Statement
Given an integer `n`, return all the strobogrammatic numbers that are of length `n`. You may return the answer in any order.

A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

## Examples
Example 1:
```
Input: n = 2
Output: ["11","69","88","96"]
```

Example 2:
```
Input: n = 1
Output: ["0","1","8"]
```

## Constraints
- `1 <= n <= 14`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try to use recursion to solve this problem.
2. For each position, we can only use certain digits (0, 1, 6, 8, 9).
3. Some digits can only be used in pairs (6,9).
4. The middle digit (if n is odd) can only be 0, 1, or 8.
5. Leading zeros are not allowed except for n=1.

</details>
