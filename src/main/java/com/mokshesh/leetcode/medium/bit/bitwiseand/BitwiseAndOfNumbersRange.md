# Bitwise AND of Numbers Range

## LeetCode Link
🔗 [Bitwise AND of Numbers Range](https://leetcode.com/problems/bitwise-and-of-numbers-range)

## Difficulty
Medium

## Topics
- Bit Manipulation

## Acceptance Rate
47.49%

## Problem Statement
Given two integers `left` and `right` that represent the range `[left, right]`, return the bitwise AND of all numbers in this range, inclusive.

## Examples
Example 1:
```
Input: left = 5, right = 7
Output: 4
```

Example 2:
```
Input: left = 0, right = 0
Output: 0
```

Example 3:
```
Input: left = 1, right = 2147483647
Output: 0
```

## Constraints
- `0 <= left <= right <= 2³¹ - 1`

## Hints
<details>
<summary>Click here to see hints</summary>

1. The key observation is that if we take the bitwise AND of all numbers in the range, only the common prefix of their binary representations will remain.
2. For example, if left = 5 (101) and right = 7 (111), the result will be 4 (100).
3. We can find this common prefix by shifting both numbers right until they are equal.
4. Then shift left by the same amount to get the final result.
5. This works because any bits that differ between left and right will become 0 in the final result.

</details>
