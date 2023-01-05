# Generate Parentheses

## LeetCode Link
🔗 [Generate Parentheses](https://leetcode.com/problems/generate-parentheses)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming
- Backtracking

## Acceptance Rate
76.32%

## Problem Statement
Given `n` pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

A combination of parentheses is considered well-formed if:
1. It contains an equal number of opening and closing parentheses
2. Every closing parenthesis has a corresponding opening parenthesis that comes before it

## Examples
Example 1:
```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
```

Example 2:
```
Input: n = 1
Output: ["()"]
```

## Constraints
- 1 <= n <= 8

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use backtracking to generate all possible combinations
2. Keep track of the count of open and closed parentheses
3. Only add an opening parenthesis if we still have some remaining (less than n)
4. Only add a closing parenthesis if it would result in a valid expression (more open than closed)
5. When the string has length 2*n, we have a valid combination

</details>
