# Integer to Roman

## LeetCode Link
🔗 [Integer to Roman](https://leetcode.com/problems/integer-to-roman)

## Difficulty
Medium

## Topics
- Math
- String
- Hash Table

## Acceptance Rate
67.53%

## Problem Statement
Seven different symbols represent Roman numerals with the following values:

| Symbol | Value |
|--------|--------|
| I      | 1      |
| V      | 5      |
| X      | 10     |
| L      | 50     |
| C      | 100    |
| D      | 500    |
| M      | 1000   |

For example, `2` is written as `II` in Roman numeral, just two one's added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`.

## Examples
Example 1:
```
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
```

Example 2:
```
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
```

Example 3:
```
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

## Constraints
- 1 <= num <= 3999

## Hints
<details>
<summary>Click here to see hints</summary>

1. Break down the number into thousands, hundreds, tens, and ones
2. Use a map or array to store the Roman numeral representations
3. Handle special cases like 4, 9, 40, 90, 400, 900 separately

</details>
