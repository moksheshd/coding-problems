# Spiral Matrix

## LeetCode Link
🔗 [Spiral Matrix](https://leetcode.com/problems/spiral-matrix)

## Difficulty
Medium

## Topics
- Array
- Matrix
- Simulation

## Acceptance Rate
52.59%

## Problem Statement
Given an `m x n` matrix, return all elements of the matrix in spiral order.

## Examples
Example 1:
```
Input: matrix = [[1,2,3],
                [4,5,6],
                [7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
```

Example 2:
```
Input: matrix = [[1,2,3,4],
                [5,6,7,8],
                [9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```

## Constraints
- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about the boundaries of the matrix
2. Keep track of four boundaries: top, bottom, left, right
3. Move in a spiral direction: right → down → left → up
4. Update boundaries after completing each direction
5. Continue until all elements are visited

</details>
