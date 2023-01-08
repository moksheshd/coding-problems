# Combination Sum II

## LeetCode Link
🔗 [Combination Sum II](https://leetcode.com/problems/combination-sum-ii)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
57.04%

## Problem Statement
Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sum to `target`.

Each number in `candidates` may only be used **once** in the combination.

**Note**: The solution set must not contain duplicate combinations.

## Examples
Example 1:
```
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
```

Example 2:
```
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
```

## Constraints
- 1 <= candidates.length <= 100
- 1 <= candidates[i] <= 50
- 1 <= target <= 30

## Hints
<details>
<summary>Click here to see hints</summary>

1. Sort the array first to handle duplicates efficiently
2. Use backtracking to try different combinations
3. Skip duplicates at the same level to avoid duplicate combinations
4. Keep track of used indices to ensure each number is used only once
5. Use a list to build combinations and add them to the result when target is reached

</details>
