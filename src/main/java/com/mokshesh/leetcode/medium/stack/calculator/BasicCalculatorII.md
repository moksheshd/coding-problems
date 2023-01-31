# Basic Calculator II

## LeetCode Link
🔗 [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii)

## Difficulty
Medium

## Topics
- Math
- String
- Stack

## Acceptance Rate
45.05%

## Problem Statement
Given a string `s` which represents an expression, evaluate this expression and return its value.

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of [-2^31, 2^31 - 1].

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.

## Examples
Example 1:
```
Input: s = "3+2*2"
Output: 7
```

Example 2:
```
Input: s = " 3/2 "
Output: 1
```

Example 3:
```
Input: s = " 3+5 / 2 "
Output: 5
```

## Constraints
- `1 <= s.length <= 3 * 10^5`
- `s` consists of integers and operators `('+', '-', '*', '/')` separated by some number of spaces.
- `s` represents a valid expression.
- All the integers in the expression are non-negative integers in the range `[0, 2^31 - 1]`.
- The answer is guaranteed to fit in a 32-bit integer.

## Hints
<details>
<summary>Click here to see hints</summary>

1. The expression is evaluated from left to right.
2. The operators have different precedence: multiplication and division have higher precedence than addition and subtraction.
3. Use a stack to handle operator precedence.
4. When encountering a number, push it onto the stack if the previous operator is + or -, otherwise evaluate it with the top of the stack.
5. Handle spaces in the input string.

</details>
