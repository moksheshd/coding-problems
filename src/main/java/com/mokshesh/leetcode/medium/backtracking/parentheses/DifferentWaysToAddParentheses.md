# Different Ways to Add Parentheses

## LeetCode Link
🔗 [Different Ways to Add Parentheses](https://leetcode.com/problems/different-ways-to-add-parentheses)

## Difficulty
Medium

## Topics
- Math
- String
- Dynamic Programming
- Recursion
- Memoization

## Acceptance Rate
71.99%

## Problem Statement
Given a string `expression` of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.

The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed `10^4`.

## Examples
Example 1:
```
Input: expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2
```

Example 2:
```
Input: expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]
Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
```

## Constraints
- `1 <= expression.length <= 20`
- `expression` consists of digits and the operator `'+'`, `'-'`, and `'*'`.
- All the integer values in the input expression are in the range `[0, 99]`.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to break down the expression into smaller subproblems.
2. Each operator can be the last operation to be performed.
3. Use recursion to solve the left and right parts of the expression around each operator.
4. Combine the results from left and right parts using the operator.
5. Consider using memoization to avoid redundant calculations.

</details>
