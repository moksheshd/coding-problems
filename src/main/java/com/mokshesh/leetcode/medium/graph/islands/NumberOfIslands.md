# Number of Islands

## LeetCode Link
🔗 [Number of Islands](https://leetcode.com/problems/number-of-islands)

## Difficulty
Medium

## Topics
- Array
- Depth-First Search
- Breadth-First Search
- Union Find
- Matrix

## Acceptance Rate
61.33%

## Problem Statement
Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Examples
Example 1:
```
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
```

Example 2:
```
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
```

## Constraints
- `m == grid.length`
- `n == grid[i].length`
- `1 <= m, n <= 300`
- `grid[i][j]` is `'0'` or `'1'`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to identify connected land cells
2. DFS or BFS can be used to explore connected cells
3. When you find a land cell ('1'), explore all its connected land cells
4. Mark visited cells to avoid counting them again
5. Each time you find an unvisited land cell, it represents a new island

</details>
