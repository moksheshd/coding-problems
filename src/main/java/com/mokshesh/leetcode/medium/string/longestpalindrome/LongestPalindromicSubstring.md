# Longest Palindromic Substring

## LeetCode Link
🔗 [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming

## Acceptance Rate
35.13%

## Problem Statement
Given a string `s`, return the longest palindromic substring in `s`.

A string is palindromic if it reads the same forward and backward.

## Examples
```
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"
```

## Constraints
- `1 <= s.length <= 1000`
- `s` consists of only digits and English letters

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider each character as a potential center of a palindrome
2. For each center, expand outwards to find the longest palindrome
3. Remember to check for both odd and even length palindromes
4. Use dynamic programming to optimize the solution
5. Keep track of the start index and length of the longest palindrome found so far

</details>
