# Reverse Words in a String II

## LeetCode Link
🔗 [Reverse Words in a String II](https://leetcode.com/problems/reverse-words-in-a-string-ii)

## Difficulty
Medium

## Topics
- Two Pointers
- String

## Acceptance Rate
55.68%

## Problem Statement
Given a character array s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by a single space.

Your code must solve the problem in-place, i.e., without allocating extra space.

## Examples
Example 1:
```
Input: s = ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
```

Example 2:
```
Input: s = ["a"]
Output: ["a"]
```

## Constraints
- `1 <= s.length <= 10^5`
- `s[i]` is an English letter (uppercase or lowercase), digit, or space `' '`
- There is at least one word in s
- `s` does not contain leading or trailing spaces
- All the words in `s` are guaranteed to be separated by a single space

## Hints
<details>
<summary>Click here to see hints</summary>

1. The problem can be solved in two steps:
   - First, reverse the entire string
   - Then reverse each word individually
2. To reverse a word, you need to find its boundaries first
3. Remember to handle the last word separately as it won't have a space after it

</details>
