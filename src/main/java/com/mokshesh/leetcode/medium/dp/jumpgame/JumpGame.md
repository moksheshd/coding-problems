# Jump Game

## LeetCode Link
🔗 [Jump Game](https://leetcode.com/problems/jump-game)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Greedy

## Acceptance Rate
39.03%

## Problem Statement
You are given an integer array `nums`. You are initially positioned at the array's **first index**, and each element in the array represents your maximum jump length at that position.

Return `true` if you can reach the last index, or `false` otherwise.

## Examples
Example 1:
```
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

Example 2:
```
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
```

## Constraints
- 1 <= nums.length <= 10⁴
- 0 <= nums[i] <= 10⁵

## Hints
<details>
<summary>Click here to see hints</summary>

1. Start from the first index and try to reach as far as possible
2. Keep track of the maximum reachable position
3. If at any point, current position is greater than maximum reachable position, return false
4. If maximum reachable position is greater than or equal to last index, return true
5. Consider using a greedy approach instead of dynamic programming for better efficiency

</details>
