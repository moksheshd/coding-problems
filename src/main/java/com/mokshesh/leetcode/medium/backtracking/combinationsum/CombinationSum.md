# Combination Sum

## LeetCode Link
🔗 [Combination Sum](https://leetcode.com/problems/combination-sum)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
73.68%

## Problem Statement
Given an array of **distinct** integers `candidates` and a target integer `target`, return *a list of all **unique combinations** of* `candidates` *where the chosen numbers sum to* `target`. You may return the combinations in **any order**.

The **same** number may be chosen from `candidates` an **unlimited number of times**. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

## Examples
Example 1:
```
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
```

Example 2:
```
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
```

Example 3:
```
Input: candidates = [2], target = 1
Output: []
```

## Constraints
- 1 <= candidates.length <= 30
- 2 <= candidates[i] <= 40
- All elements of candidates are distinct
- 1 <= target <= 40

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about using backtracking to generate all possible combinations
2. Use recursion to try different combinations of numbers
3. Keep track of the current sum and remaining target
4. Consider sorting the candidates array first to optimize the solution
5. Use a list to build combinations and add them to the result when target is reached

</details>
