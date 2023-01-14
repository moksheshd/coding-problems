# Minimum Path Sum

## LeetCode Link
🔗 [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Matrix

## Acceptance Rate
65.67%

## Problem Statement
Given an `m x n` `grid` filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

**Note:** You can only move either down or right at any point in time.

## Examples
Example 1:
```
Input: grid = [
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
```

Example 2:
```
Input: grid = [[1,2,3],[4,5,6]]
Output: 12
```

## Constraints
- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 200
- 0 <= grid[i][j] <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use dynamic programming to solve this problem
2. For each cell, the minimum path sum to reach it is the minimum of the path sums from the cell above and the cell to the left
3. Create a DP table where dp[i][j] represents the minimum path sum to reach cell (i,j)
4. Base cases: First row and first column can only be reached from one direction
5. Fill the table using dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])

</details>
