# Zigzag Conversion

## LeetCode Link
🔗 [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion)

## Difficulty
Medium

## Topics
- String
- Pattern Matching

## Acceptance Rate
50.48%

## Problem Statement
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows.

## Examples
Example 1:
```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

## Constraints
- 1 <= s.length <= 1000
- s consists of English letters (lower-case and upper-case), ',' and '.'
- 1 <= numRows <= 1000

## Hints
<details>
<summary>Click here to see hints</summary>

1. Visit the characters in a zigzag pattern and build the string row by row
2. Keep track of when to change direction while traversing the string
3. The zigzag pattern repeats after 2*numRows - 2 characters

</details>
