# Search in Rotated Sorted Array II

## LeetCode Link
🔗 [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii)

## Difficulty
Medium

## Topics
- Array
- Binary Search

## Acceptance Rate
38.49%

## Problem Statement
There is an integer array `nums` sorted in non-decreasing order (not necessarily with **distinct** values).

Before being passed to your function, `nums` is **rotated** at an unknown pivot index `k` (`0 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index `5` and become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums` after the rotation and an integer `target`, return `true` if `target` is in `nums`, or `false` if it is not in `nums`.

You must decrease the overall operation steps as much as possible.

## Examples
Example 1:
```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
```

Example 2:
```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```

## Constraints
- 1 <= nums.length <= 5000
- -10⁴ <= nums[i] <= 10⁴
- nums is guaranteed to be rotated at some pivot
- -10⁴ <= target <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. This is a follow-up problem to Search in Rotated Sorted Array, where nums may contain duplicates.
2. The presence of duplicates affects the runtime complexity because we may need to check both halves.
3. When we find nums[mid] == nums[left], we cannot determine which half is sorted.
4. In this case, we can only move left pointer by one to skip one duplicate.

</details>
