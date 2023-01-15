# Set Matrix Zeroes

## LeetCode Link
🔗 [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- Matrix

## Acceptance Rate
58.64%

## Problem Statement
Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`'s.

You must do it **in place**.

## Examples
Example 1:
```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
```

Example 2:
```
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

## Constraints
- m == matrix.length
- n == matrix[0].length
- 1 <= m, n <= 200
- -231 <= matrix[i][j] <= 231 - 1

## Follow up
- A straightforward solution using O(mn) space is probably a bad idea.
- A simple improvement uses O(m + n) space, but still not the best solution.
- Could you devise a constant space solution?

## Hints
<details>
<summary>Click here to see hints</summary>

1. If any cell of the matrix has a zero we can record its row and column number using additional memory. But if you don't want to use extra memory then you can manipulate the array instead.
2. Use first row and first column as markers. For each cell (i,j), if it is zero, mark matrix[i][0] and matrix[0][j] as zero.
3. Then iterate through the array again and if either matrix[i][0] or matrix[0][j] is zero, update matrix[i][j] to zero.
4. Take care of first row and column separately as they were used as markers.

</details>
