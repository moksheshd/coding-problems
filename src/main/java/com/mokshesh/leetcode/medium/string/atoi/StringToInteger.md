# String to Integer (atoi)

## LeetCode Link
🔗 [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi)

## Difficulty
Medium

## Topics
- String
- Math
- Parsing

## Acceptance Rate
18.56%

## Problem Statement
Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

The algorithm for `myAtoi(string s)` is as follows:

1. **Whitespace**: Ignore any leading whitespace.
2. **Signedness**: Determine the sign by checking if the next character is `-` or `+`, assuming positivity if neither present.
3. **Conversion**: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
4. **Rounding**: If the integer is out of the 32-bit signed integer range [-2³¹, 2³¹ - 1], then round the integer to remain in the range. Specifically:
   - Integers less than -2³¹ should be rounded to -2³¹
   - Integers greater than 2³¹ - 1 should be rounded to 2³¹ - 1

## Examples
Example 1:
```
Input: s = "42"
Output: 42
```

Example 2:
```
Input: s = "   -42"
Output: -42
```

Example 3:
```
Input: s = "4193 with words"
Output: 4193
```

## Constraints
- 0 <= s.length <= 200
- s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'

## Hints
<details>
<summary>Click here to see hints</summary>

1. Handle each step of the algorithm separately: whitespace, sign, digits, and overflow
2. Use a loop to process digits until a non-digit character is encountered
3. Be careful with integer overflow - consider using a long to store intermediate results
4. Remember to handle edge cases like empty strings or strings with no valid digits

</details>
