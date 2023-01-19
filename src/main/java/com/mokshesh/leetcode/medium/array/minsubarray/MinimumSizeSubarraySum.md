# Minimum Size Subarray Sum

## LeetCode Link
🔗 [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum)

## Difficulty
Medium

## Topics
- Array
- Binary Search
- Sliding Window
- Prefix Sum

## Acceptance Rate
48.55%

## Problem Statement
Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a subarray whose sum is greater than or equal to `target`. If there is no such subarray, return `0` instead.

## Examples
Example 1:
```
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

Example 2:
```
Input: target = 4, nums = [1,4,4]
Output: 1
```

Example 3:
```
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
```

## Constraints
- `1 <= target <= 10⁹`
- `1 <= nums.length <= 10⁵`
- `1 <= nums[i] <= 10⁴`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider using a sliding window approach.
2. Keep track of the current sum in the window.
3. When the sum becomes greater than or equal to target, try to minimize the window size by moving the start pointer.
4. Keep track of the minimum window size seen so far.

</details>
