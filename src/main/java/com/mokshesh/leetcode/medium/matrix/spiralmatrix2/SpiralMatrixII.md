# Spiral Matrix II

## LeetCode Link
🔗 [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii)

## Difficulty
Medium

## Topics
- Array
- Matrix
- Simulation

## Acceptance Rate
72.77%

## Problem Statement
Given a positive integer `n`, generate an `n x n` matrix filled with elements from `1` to `n²` in spiral order.

## Examples
Example 1:
```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Explanation:
The output matrix should be filled in spiral order:
1 → 2 → 3
        ↓
8 → 9   4
↑       ↓
7 ← 6 ← 5
```

Example 2:
```
Input: n = 1
Output: [[1]]
```

## Constraints
- 1 <= n <= 20

## Hints
<details>
<summary>Click here to see hints</summary>

1. Create an n x n matrix filled with zeros
2. Keep track of four boundaries: top, bottom, left, right
3. Move in a spiral direction: right → down → left → up
4. Fill numbers from 1 to n² in order while moving
5. Update boundaries after completing each direction
6. Continue until all numbers are filled

</details>
