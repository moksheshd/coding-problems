# Permutations II

## LeetCode Link
🔗 [Permutations II](https://leetcode.com/problems/permutations-ii)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
60.77%

## Problem Statement
Given a collection of numbers, `nums`, that might contain duplicates, return *all possible unique permutations* in **any order**.

## Examples
Example 1:
```
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
```

Example 2:
```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

## Constraints
- 1 <= nums.length <= 8
- -10 <= nums[i] <= 10

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to handle duplicates efficiently
2. Use backtracking to generate permutations
3. Skip duplicate numbers at the same level to avoid duplicate permutations
4. Keep track of used indices to avoid reusing numbers
5. Use a set or sorting to ensure uniqueness of permutations

</details>
