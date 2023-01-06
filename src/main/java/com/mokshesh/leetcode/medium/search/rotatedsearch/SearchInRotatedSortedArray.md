# Search in Rotated Sorted Array

## LeetCode Link
🔗 [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array)

## Difficulty
Medium

## Topics
- Array
- Binary Search

## Acceptance Rate
42.16%

## Problem Statement
There is an integer array `nums` sorted in ascending order (with **distinct** values).

Prior to being passed to your function, `nums` is **possibly rotated** at an unknown pivot index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (0-indexed). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`.

Given the array `nums` **after** the possible rotation and an integer `target`, return *the index of* `target` *if it is in* `nums`, *or* `-1` *if it is not in* `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

## Examples
Example 1:
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

Example 2:
```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```

Example 3:
```
Input: nums = [1], target = 0
Output: -1
```

## Constraints
- 1 <= nums.length <= 5000
- -10⁴ <= nums[i] <= 10⁴
- All values of nums are unique
- nums is an ascending array that is possibly rotated
- -10⁴ <= target <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you would search in a sorted array
2. The array is sorted but rotated, can you still use binary search?
3. Think about how you can find the pivot point
4. Once you find the pivot, you can split the array into two sorted arrays
5. You can then perform binary search on the appropriate half

</details>
