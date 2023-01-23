# Maximal Square

## LeetCode Link
🔗 [Maximal Square](https://leetcode.com/problems/maximal-square)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Matrix

## Acceptance Rate
48.03%

## Problem Statement
Given an `m x n` binary matrix filled with `0`'s and `1`'s, find the largest square containing only `1`'s and return its area.

## Examples
Example 1:
```
Input: matrix = [
  ["1","0","1","0","0"],
  ["1","0","1","1","1"],
  ["1","1","1","1","1"],
  ["1","0","0","1","0"]
]
Output: 4
```

Example 2:
```
Input: matrix = [["0","1"],["1","0"]]
Output: 1
```

Example 3:
```
Input: matrix = [["0"]]
Output: 0
```

## Constraints
- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 300`
- `matrix[i][j]` is `'0'` or `'1'`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try to build a square from its bottom-right corner.
2. For each cell, if it is a '1', check the cells to its left, top, and top-left.
3. The size of the square that can be formed at the current cell depends on the minimum value among these three cells.
4. Use dynamic programming to store intermediate results.
5. The final answer will be the square of the maximum value in the DP table.

</details>
