# Single Number II

## LeetCode Link
🔗 [Single Number II](https://leetcode.com/problems/single-number-ii)

## Difficulty
Medium

## Topics
- Array
- Bit Manipulation

## Acceptance Rate
64.47%

## Problem Statement
Given an integer array `nums` where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

## Examples
Example 1:
```
Input: nums = [2,2,3,2]
Output: 3
```

Example 2:
```
Input: nums = [0,1,0,1,0,1,99]
Output: 99
```

## Constraints
- 1 <= nums.length <= 3 * 10^4
- -2^31 <= nums[i] <= 2^31 - 1
- Each element in nums appears exactly three times except for one element which appears once

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider the binary representation of each number
2. For each bit position, count the number of 1s in all numbers
3. If a bit position has a count that's not divisible by 3, that bit must be from the single number
4. Combine all such bits to get the answer

</details>
