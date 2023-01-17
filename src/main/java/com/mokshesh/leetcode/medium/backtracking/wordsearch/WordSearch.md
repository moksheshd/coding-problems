# Word Search

## LeetCode Link
🔗 [Word Search](https://leetcode.com/problems/word-search)

## Difficulty
Medium

## Topics
- Array
- Matrix
- Backtracking

## Acceptance Rate
44.41%

## Problem Statement
Given an `m x n` grid of characters `board` and a string `word`, return `true` if `word` exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

## Examples
Example 1:
```
Input: board = [
  ["A","B","C","E"],
  ["S","F","C","S"],
  ["A","D","E","E"]
], word = "ABCCED"
Output: true
```

Example 2:
```
Input: board = [
  ["A","B","C","E"],
  ["S","F","C","S"],
  ["A","D","E","E"]
], word = "SEE"
Output: true
```

Example 3:
```
Input: board = [
  ["A","B","C","E"],
  ["S","F","C","S"],
  ["A","D","E","E"]
], word = "ABCB"
Output: false
```

## Constraints
- m == board.length
- n = board[i].length
- 1 <= m, n <= 6
- 1 <= word.length <= 15
- board and word consists of only lowercase and uppercase English letters.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use backtracking to try all possible paths in the grid.
2. For each starting position, try to build the word by exploring adjacent cells.
3. Keep track of visited cells to avoid using the same cell twice.
4. When exploring neighbors, check bounds and if the current character matches.

</details>
