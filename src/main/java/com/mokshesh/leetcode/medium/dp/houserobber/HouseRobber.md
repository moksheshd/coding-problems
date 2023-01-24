# House Robber

## LeetCode Link
🔗 [House Robber](https://leetcode.com/problems/house-robber)

## Difficulty
Medium

## Topics
- Dynamic Programming
- Array

## Acceptance Rate
51.89%

## Problem Statement
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

## Examples
Example 1:
```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
```

Example 2:
```
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
```

## Constraints
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about the base cases: what if there is only one house or two houses?
2. For each house, you have two options: rob it or skip it
3. If you rob the current house, you can't rob the previous one
4. Use dynamic programming to store the maximum amount that can be robbed up to each house
5. For each house i, the maximum amount is either:
   - The maximum amount up to house i-1 (skip current house)
   - The maximum amount up to house i-2 plus the current house value (rob current house)

</details>
