# Subsets

## LeetCode Link
🔗 [Subsets](https://leetcode.com/problems/subsets)

## Difficulty
Medium

## Topics
- Array
- Backtracking
- Bit Manipulation

## Acceptance Rate
80.05%

## Problem Statement
Given an integer array `nums` of **unique** elements, return all possible subsets (the power set).

The solution set **must not** contain duplicate subsets. Return the solution in **any order**.

## Examples
Example 1:
```
Input: nums = [1,2,3]
Output: [[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]]
```

Example 2:
```
Input: nums = [0]
Output: [[],[0]]
```

## Constraints
- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about using backtracking to generate all possible combinations.
2. For each number, you have two choices: either include it in the current subset or not.
3. You can also solve this using bit manipulation since each element can be either included or not (binary choice).
4. For an array of length n, there will be exactly 2^n subsets.

</details>
