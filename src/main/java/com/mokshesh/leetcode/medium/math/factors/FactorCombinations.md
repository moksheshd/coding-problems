# Factor Combinations

## LeetCode Link
🔗 [Factor Combinations](https://leetcode.com/problems/factor-combinations)

## Difficulty
Medium

## Topics
- Math
- Backtracking

## Acceptance Rate
50.09%

## Problem Statement
Numbers can be regarded as the product of their factors. For example:
```
8 = 2 x 2 x 2
  = 2 x 4
```

Write a function that takes an integer n and returns all possible combinations of its factors. You may return the answer in any order.

Note that the factors should be in the range [2, n-1].

## Examples
Example 1:
```
Input: n = 1
Output: []
```

Example 2:
```
Input: n = 12
Output: [[2,6],[2,2,3],[3,4]]
```

Example 3:
```
Input: n = 37
Output: []
```

## Constraints
- `1 <= n <= 10^8`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to find all factors of a number first.
2. For each factor, you can recursively find factors of the remaining number.
3. Be careful not to include duplicate combinations.
4. Consider sorting factors to avoid duplicates.
5. You can use backtracking to generate all possible combinations.

</details>
