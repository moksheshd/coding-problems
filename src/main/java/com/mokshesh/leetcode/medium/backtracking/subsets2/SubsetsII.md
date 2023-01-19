# Subsets II

## LeetCode Link
🔗 [Subsets II](https://leetcode.com/problems/subsets-ii)

## Difficulty
Medium

## Topics
- Array
- Backtracking
- Bit Manipulation

## Acceptance Rate
58.71%

## Problem Statement
Given an integer array `nums` that may contain duplicates, return *all possible subsets (the power set)*.

The solution set **must not** contain duplicate subsets. Return the solution in **any order**.

## Examples
Example 1:
```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
```

Example 2:
```
Input: nums = [0]
Output: [[],[0]]
```

## Constraints
- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to handle duplicates easily
2. Use backtracking to generate all possible subsets
3. Skip duplicates during backtracking to avoid duplicate subsets
4. Keep track of the current subset and add it to the result when appropriate
5. Use a set or similar data structure to ensure uniqueness of subsets

</details>
