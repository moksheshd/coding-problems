# Permutations

## LeetCode Link
🔗 [Permutations](https://leetcode.com/problems/permutations)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
79.95%

## Problem Statement
Given an array `nums` of distinct integers, return *all the possible permutations*. You can return the answer in **any order**.

## Examples
Example 1:
```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

Example 2:
```
Input: nums = [0,1]
Output: [[0,1],[1,0]]
```

Example 3:
```
Input: nums = [1]
Output: [[1]]
```

## Constraints
- 1 <= nums.length <= 6
- -10 <= nums[i] <= 10
- All the integers of nums are unique

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about using backtracking to generate all possible permutations
2. For each position, try placing each remaining number
3. Keep track of used numbers to avoid duplicates
4. Use recursion to build permutations step by step
5. Remember to restore the state when backtracking

</details>
