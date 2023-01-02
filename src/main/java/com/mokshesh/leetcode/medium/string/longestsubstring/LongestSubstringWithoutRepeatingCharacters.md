# Longest Substring Without Repeating Characters

## LeetCode Link
🔗 [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters)

## Difficulty
Medium

## Topics
- Hash Table
- String
- Sliding Window

## Acceptance Rate
36.14%

## Problem Statement
Given a string `s`, find the length of the longest substring without repeating characters.

## Examples
```
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Constraints
- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols and spaces

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a sliding window approach with two pointers
2. Keep track of characters in the current window using a hash set
3. When you find a repeating character, shrink the window from the left
4. Update the maximum length whenever you find a valid window

</details>
