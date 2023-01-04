# Letter Combinations of a Phone Number

## LeetCode Link
🔗 [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number)

## Difficulty
Medium

## Topics
- String
- Backtracking
- Hash Table
- Recursion

## Acceptance Rate
62.81%

## Problem Statement
Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in **any order**.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

```
2 -> abc
3 -> def
4 -> ghi
5 -> jkl
6 -> mno
7 -> pqrs
8 -> tuv
9 -> wxyz
```

## Examples
Example 1:
```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

Example 2:
```
Input: digits = ""
Output: []
```

Example 3:
```
Input: digits = "2"
Output: ["a","b","c"]
```

## Constraints
- 0 <= digits.length <= 4
- digits[i] is a digit in the range ['2', '9']

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a hash map to store the digit to letters mapping
2. Use backtracking to generate all possible combinations
3. For each digit, try all possible letters and recursively solve for the remaining digits
4. Base case is when we've processed all digits and have a valid combination

</details>
