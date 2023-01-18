# 3Sum Smaller

## LeetCode Link
🔗 [3Sum Smaller](https://leetcode.com/problems/3sum-smaller)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Sorting
- Binary Search

## Acceptance Rate
50.94%

## Problem Statement
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

## Examples
Example 1:
```
Input: nums = [-2,0,1,3], target = 2
Output: 2
Explanation: Because there are two triplets which sums are less than 2:
[-2,0,1]
[-2,0,3]
```

Example 2:
```
Input: nums = [], target = 0
Output: 0
```

Example 3:
```
Input: nums = [0], target = 0
Output: 0
```

## Constraints
- `n == nums.length`
- `0 <= n <= 3500`
- `-100 <= nums[i] <= 100`
- `-100 <= target <= 100`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to make it easier to handle.
2. Use two pointers technique after sorting.
3. For each index i, use two pointers (left = i+1, right = n-1) to count pairs that sum with nums[i] is less than target.
4. When you find a valid right pointer for a left pointer, all numbers between left and right are also valid.

</details>
