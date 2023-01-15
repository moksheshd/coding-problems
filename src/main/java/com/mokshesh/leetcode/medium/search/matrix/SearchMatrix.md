# Search a 2D Matrix

## LeetCode Link
🔗 [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix)

## Difficulty
Medium

## Topics
- Array
- Binary Search
- Matrix

## Acceptance Rate
51.63%

## Problem Statement
You are given an `m x n` integer matrix with the following two properties:

1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` if `target` is in `matrix` or `false` otherwise.

You must write a solution in `O(log(m * n))` time complexity.

## Examples
Example 1:
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

Example 2:
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```

## Constraints
- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about the matrix as a sorted array laid out row by row
2. Since the matrix has special properties (sorted rows and first element > last element of previous row), you can treat it as a single sorted array
3. Use binary search to find the target in O(log(m*n)) time
4. Convert array index to matrix coordinates using division and modulo operations

</details>
