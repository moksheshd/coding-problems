# House Robber II

## LeetCode Link
🔗 [House Robber II](https://leetcode.com/problems/house-robber-ii)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming

## Acceptance Rate
42.99%

## Problem Statement
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

## Examples
Example 1:
```
Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
```

Example 2:
```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
```

Example 3:
```
Input: nums = [1,2,3]
Output: 3
```

## Constraints
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 1000`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Since houses are arranged in a circle, the first and last houses are adjacent. This means you cannot rob both of them.
2. Break this problem into two subproblems:
   - Rob houses from index 0 to n-2 (excluding the last house)
   - Rob houses from index 1 to n-1 (excluding the first house)
3. Take the maximum of these two subproblems.
4. For each subproblem, use the same logic as House Robber I.

</details>
