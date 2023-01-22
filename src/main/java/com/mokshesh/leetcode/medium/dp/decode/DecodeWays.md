# Decode Ways

## LeetCode Link
🔗 [Decode Ways](https://leetcode.com/problems/decode-ways)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming

## Acceptance Rate
35.97%

## Problem Statement
You have intercepted a secret message encoded as a string of numbers. The message is **decoded** via the following mapping:
- '1' -> 'A'
- '2' -> 'B'
...
- '26' -> 'Z'

Given a string `s` containing only digits, return *the number of ways to decode it*.

The test cases are generated so that the answer fits in a 32-bit integer.

## Examples
Example 1:
```
Input: s = "12"
Output: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
```

Example 2:
```
Input: s = "226"
Output: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
```

Example 3:
```
Input: s = "06"
Output: 0
Explanation: "06" cannot be mapped to "F" since "6" is different from "06".
```

## Constraints
- 1 <= s.length <= 100
- s contains only digits and may contain leading zero(s)

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use dynamic programming to solve this problem
2. For each position, consider if it can be decoded alone (1-9) or paired with previous digit (10-26)
3. Handle leading zeros carefully as they cannot form valid decodings
4. Build your solution by considering subproblems of increasing length

</details>
