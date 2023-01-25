# Triangle

## LeetCode Link
🔗 [Triangle](https://leetcode.com/problems/triangle)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming

## Acceptance Rate
58.42%

## Problem Statement
Given a `triangle` array, return *the minimum path sum from top to bottom*.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index `i` on the current row, you may move to either index `i` or index `i + 1` on the next row.

## Examples
Example 1:
```
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is: 2 + 3 + 5 + 1 = 11
```

Example 2:
```
Input: triangle = [[-10]]
Output: -10
```

## Constraints
- 1 <= triangle.length <= 200
- triangle[0].length == 1
- triangle[i].length == triangle[i - 1].length + 1
- -10⁴ <= triangle[i][j] <= 10⁴

## Follow-up
Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about dynamic programming approach
2. For each step, you can only move to adjacent numbers in the row below
3. Keep track of minimum path sum for each position
4. Consider bottom-up approach to save space
5. You only need to store the minimum path sums for the current row and the row below

</details>
