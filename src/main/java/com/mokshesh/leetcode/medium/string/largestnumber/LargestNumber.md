# Largest Number

## LeetCode Link
🔗 [Largest Number](https://leetcode.com/problems/largest-number)

## Difficulty
Medium

## Topics
- Array
- String
- Sorting
- Greedy

## Acceptance Rate
40.68%

## Problem Statement
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

## Examples
Example 1:
```
Input: nums = [10,2]
Output: "210"
```

Example 2:
```
Input: nums = [3,30,34,5,9]
Output: "9534330"
```

## Constraints
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 10^9`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Convert each integer to a string.
2. Sort strings according to a special rule: if a+b > b+a, then a should be ahead of b in the final arrangement.
3. Join the sorted strings to get the final result.
4. Handle edge case where all numbers are 0.

</details>
