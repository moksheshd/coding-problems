# Surrounded Regions

## LeetCode Link
🔗 [Surrounded Regions](https://leetcode.com/problems/surrounded-regions)

## Difficulty
Medium

## Topics
- Array
- Depth-First Search
- Breadth-First Search
- Union Find
- Matrix

## Acceptance Rate
41.78%

## Problem Statement
Given an `m x n` matrix `board` containing `'X'` and `'O'`, capture all regions that are 4-directionally surrounded by `'X'`.

A region is captured by flipping all `'O'`s into `'X'`s in that surrounded region.

A cell is connected to another cell horizontally or vertically (not diagonally).

A region is a group of connected `'O'` cells.

A region is surrounded if all cells on the edge of the region are `'X'` cells.

## Examples
Example 1:
```
Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
Explanation: Notice that an 'O' should not be flipped if:
- It is on the border, or
- It is adjacent to an 'O' that should not be flipped.
The bottom 'O' is on the border, so it is not flipped.
The other three 'O' form a surrounded region, so they are flipped.
```

Example 2:
```
Input: board = [["X"]]
Output: [["X"]]
```

## Constraints
- m == board.length
- n == board[i].length
- 1 <= m, n <= 200
- board[i][j] is 'X' or 'O'

## Hints
<details>
<summary>Click here to see hints</summary>

1. Start from the border cells and mark all 'O' cells that are connected to them
2. These marked cells cannot be captured as they are connected to the border
3. After marking, any remaining 'O' cells must be surrounded by 'X' cells
4. Convert all unmarked 'O' cells to 'X' cells

</details>
