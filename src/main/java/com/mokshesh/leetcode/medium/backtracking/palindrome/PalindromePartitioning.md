# Palindrome Partitioning

## LeetCode Link
🔗 [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming
- Backtracking

## Acceptance Rate
71.14%

## Problem Statement
Given a string `s`, partition `s` such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of `s`.

A palindrome string is a string that reads the same backward as forward.

## Examples
Example 1:
```
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
```

Example 2:
```
Input: s = "a"
Output: [["a"]]
```

## Constraints
- 1 <= s.length <= 16
- s contains only lowercase English letters

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider using backtracking to generate all possible partitions
2. For each partition, check if each substring is a palindrome
3. Use dynamic programming to optimize palindrome checking
4. Keep track of current partition and add it to result when you reach the end of string

</details>
