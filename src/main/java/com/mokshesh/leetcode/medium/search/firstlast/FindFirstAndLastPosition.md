# Find First and Last Position of Element in Sorted Array

## LeetCode Link
🔗 [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)

## Difficulty
Medium

## Topics
- Array
- Binary Search

## Acceptance Rate
45.94%

## Problem Statement
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

## Examples
Example 1:
```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

Example 2:
```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

Example 3:
```
Input: nums = [], target = 0
Output: [-1,-1]
```

## Constraints
- 0 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹
- nums is a non-decreasing array
- -10⁹ <= target <= 10⁹

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use binary search to find the target value first
2. Once you find the target, search for its leftmost and rightmost occurrences
3. You can modify binary search to find the leftmost occurrence
4. Similarly, modify binary search to find the rightmost occurrence
5. Combine both results to get the range

</details>
