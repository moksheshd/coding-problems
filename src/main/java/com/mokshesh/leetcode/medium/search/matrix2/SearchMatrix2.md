# Search a 2D Matrix II

## LeetCode Link
🔗 [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii)

## Difficulty
Medium

## Topics
- Array
- Binary Search
- Matrix
- Divide and Conquer

## Acceptance Rate
54.24%

## Problem Statement
Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`. This matrix has the following properties:

- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.

## Examples
Example 1:
```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
```

Example 2:
```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
```

## Constraints
- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= n, m <= 300`
- `-10^9 <= matrix[i][j] <= 10^9`
- All the integers in each row are sorted in ascending order.
- All the integers in each column are sorted in ascending order.
- `-10^9 <= target <= 10^9`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Start from the top-right corner of the matrix.
2. If the current element is greater than target, move left.
3. If the current element is less than target, move down.
4. If the current element equals target, return true.
5. If we move out of bounds, return false.

</details>
