# Maximum Subarray

## LeetCode Link
🔗 [Maximum Subarray](https://leetcode.com/problems/maximum-subarray)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Divide and Conquer

## Acceptance Rate
51.61%

## Problem Statement
Given an integer array `nums`, find the subarray with the largest sum, and return its sum.

## Examples
Example 1:
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
```

Example 2:
```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
```

Example 3:
```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```

## Constraints
- 1 <= nums.length <= 10⁵
- -10⁴ <= nums[i] <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider using Kadane's algorithm
2. Keep track of the maximum sum ending at each position
3. At each position, decide whether to start a new subarray or extend the existing one
4. The maximum sum at each position is either the current number or the sum of the current number and the maximum sum ending at the previous position
5. Keep track of the global maximum sum seen so far

</details>
