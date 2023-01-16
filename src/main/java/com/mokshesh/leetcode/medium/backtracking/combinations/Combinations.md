# Combinations

## LeetCode Link
🔗 [Combinations](https://leetcode.com/problems/combinations)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
72.07%

## Problem Statement
Given two integers `n` and `k`, return all possible combinations of `k` numbers chosen from the range `[1, n]`.

You may return the answer in **any order**.

## Examples
Example 1:
```
Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
```

Example 2:
```
Input: n = 1, k = 1
Output: [[1]]
```

## Constraints
- 1 <= n <= 20
- 1 <= k <= n

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about using backtracking to generate all possible combinations.
2. For each position in the combination, try all possible numbers that haven't been used yet.
3. Remember that combinations are unordered, so [1,2] and [2,1] are considered the same.
4. To avoid duplicates, only consider numbers greater than the last number added to the combination.

</details>
