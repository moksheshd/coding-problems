# Fraction to Recurring Decimal

## LeetCode Link
🔗 [Fraction to Recurring Decimal](https://leetcode.com/problems/fraction-to-recurring-decimal)

## Difficulty
Medium

## Topics
- Math
- Hash Table
- String

## Acceptance Rate
25.77%

## Problem Statement
Given two integers representing the `numerator` and `denominator` of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

If multiple answers are possible, return any of them.

It is guaranteed that the length of the answer string is less than 10^4 for all the given inputs.

## Examples
Example 1:
```
Input: numerator = 1, denominator = 2
Output: "0.5"
```

Example 2:
```
Input: numerator = 2, denominator = 1
Output: "2"
```

Example 3:
```
Input: numerator = 4, denominator = 333
Output: "0.(012)"
```

## Constraints
- -2^31 <= numerator, denominator <= 2^31 - 1
- denominator != 0

## Hints
<details>
<summary>Click here to see hints</summary>

1. No scary math, just apply elementary math knowledge. Still remember how to perform a long division?
2. Try a long division on 4/9, the repeating part is obvious. Now try 4/333. Do you see a pattern?
3. Notice that once the remainder starts repeating, so does the divided result.
4. Be wary of edge cases! List out as many test cases as you can think of and test your code thoroughly.

</details>
