# 3Sum

## LeetCode Link
🔗 [3Sum](https://leetcode.com/problems/3sum)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Sorting

## Acceptance Rate
36.21%

## Problem Statement
Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

## Examples
Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
```

## Constraints
- 3 <= nums.length <= 3000
- -10⁵ <= nums[i] <= 10⁵

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to make it easier to handle duplicates
2. Use two pointers technique after fixing one number
3. Skip duplicate values to avoid duplicate triplets
4. For each number, look for two other numbers that sum to its negative

</details>
