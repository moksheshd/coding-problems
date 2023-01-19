# Combination Sum III

## LeetCode Link
🔗 [Combination Sum III](https://leetcode.com/problems/combination-sum-iii)

## Difficulty
Medium

## Topics
- Array
- Backtracking

## Acceptance Rate
71.20%

## Problem Statement
Find all valid combinations of `k` numbers that sum up to `n` such that the following conditions are true:

- Only numbers 1 through 9 are used.
- Each number is used at most once.

Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

## Examples
Example 1:
```
Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
```

Example 2:
```
Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.
```

Example 3:
```
Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
```

## Constraints
- `2 <= k <= 9`
- `1 <= n <= 60`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you can use backtracking to generate all possible combinations.
2. For each position, try using numbers from 1 to 9 that haven't been used yet.
3. Keep track of the current sum and the number of elements used.
4. When the current sum equals n and you've used exactly k numbers, you've found a valid combination.
5. Remember to remove the number after exploring all possibilities with it (backtrack).

</details>
