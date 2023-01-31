# Longest Substring with At Most Two Distinct Characters

## LeetCode Link
🔗 [Longest Substring with At Most Two Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters)

## Difficulty
Medium

## Topics
- Hash Table
- String
- Sliding Window

## Acceptance Rate
56.03%

## Problem Statement
Given a string `s`, find the length of the longest substring that contains at most two distinct characters.

## Examples
Example 1:
```
Input: s = "eceba"
Output: 3
Explanation: The substring is "ece" which its length is 3.
```

Example 2:
```
Input: s = "ccaabbb"
Output: 5
Explanation: The substring is "aabbb" which its length is 5.
```

## Constraints
- 1 <= s.length <= 10^5
- s consists of English letters.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try using a sliding window approach.
2. Use a hash map to keep track of character frequencies.
3. When the number of distinct characters exceeds 2, shrink the window from the left.

</details>
