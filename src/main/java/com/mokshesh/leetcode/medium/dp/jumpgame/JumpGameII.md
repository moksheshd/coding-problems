# Jump Game II

## LeetCode Link
🔗 [Jump Game II](https://leetcode.com/problems/jump-game-ii)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Greedy

## Acceptance Rate
41.02%

## Problem Statement
You are given a 0-indexed array of integers `nums` of length `n`. You are initially positioned at `nums[0]`.

Each element `nums[i]` represents the maximum length of a forward jump from index `i`. In other words, if you are at `nums[i]`, you can jump to any `nums[i + j]` where:

- `0 <= j <= nums[i]` and
- `i + j < n`

Return *the minimum number of jumps to reach* `nums[n - 1]`. The test cases are generated such that you can reach `nums[n - 1]`.

## Examples
Example 1:
```
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

Example 2:
```
Input: nums = [2,3,0,1,4]
Output: 2
```

## Constraints
- 1 <= nums.length <= 10⁴
- 0 <= nums[i] <= 1000
- It's guaranteed that you can reach nums[n - 1]

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try to reach the end with minimum jumps
2. At each position, try to reach as far as possible
3. Keep track of the maximum reachable position
4. Update jumps count when you need to take a jump
5. Use greedy approach to minimize the number of jumps

</details>
