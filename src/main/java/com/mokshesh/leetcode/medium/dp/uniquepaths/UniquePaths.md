# Unique Paths

## LeetCode Link
🔗 [Unique Paths](https://leetcode.com/problems/unique-paths)

## Difficulty
Medium

## Topics
- Math
- Dynamic Programming
- Combinatorics

## Acceptance Rate
65.29%

## Problem Statement
There is a robot on an `m x n` grid. The robot is initially located at the **top-left corner** (i.e., `grid[0][0]`). The robot tries to move to the **bottom-right corner** (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

Given the two integers `m` and `n`, return *the number of possible unique paths that the robot can take to reach the bottom-right corner*.

The test cases are generated so that the answer will be less than or equal to `2 * 10⁹`.

## Examples
Example 1:
```
Input: m = 3, n = 7
Output: 28
```

Example 2:
```
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
```

## Constraints
- 1 <= m, n <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try using dynamic programming
2. For each cell, the number of paths to reach it is the sum of paths from the cell above and the cell to the left
3. Create a 2D DP table where dp[i][j] represents the number of unique paths to reach cell (i,j)
4. Base case: dp[0][j] = 1 and dp[i][0] = 1 (only one way to reach cells in first row and first column)
5. Fill the table using dp[i][j] = dp[i-1][j] + dp[i][j-1]

</details>
