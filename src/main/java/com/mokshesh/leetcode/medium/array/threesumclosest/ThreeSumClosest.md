# 3Sum Closest

## LeetCode Link
🔗 [3Sum Closest](https://leetcode.com/problems/3sum-closest)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Sorting

## Acceptance Rate
46.49%

## Problem Statement
Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is closest to `target`.

Return *the sum of the three integers*.

You may assume that each input would have exactly one solution.

## Examples
Example 1:
```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```

Example 2:
```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum closest to target is 0. (0 + 0 + 0 = 0).
```

## Constraints
- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -10⁴ <= target <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to make it easier to find closest sum
2. Use two pointers technique after fixing one number
3. For each fixed number, use two pointers to find the pair that gets closest to the remaining target
4. Keep track of the minimum difference between the sum and target

</details>
