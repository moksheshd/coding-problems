# Multiply Strings

## LeetCode Link
🔗 [Multiply Strings](https://leetcode.com/problems/multiply-strings)

## Difficulty
Medium

## Topics
- Math
- String
- Simulation

## Acceptance Rate
41.65%

## Problem Statement
Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

**Note**: You must not use any built-in BigInteger library or convert the inputs to integer directly.

## Examples
Example 1:
```
Input: num1 = "2", num2 = "3"
Output: "6"
```

Example 2:
```
Input: num1 = "123", num2 = "456"
Output: "56088"
```

## Constraints
- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only
- Both num1 and num2 do not contain any leading zero, except the number 0 itself

## Hints
<details>
<summary>Click here to see hints</summary>

1. Remember how we do multiplication in elementary school
2. Break the problem into smaller sub-problems
3. Multiply each digit of one number with each digit of the other number
4. Add the results at appropriate positions
5. Handle carry-over during addition and multiplication

</details>
