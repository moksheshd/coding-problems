# Interleaving String

## LeetCode Link
🔗 [Interleaving String](https://leetcode.com/problems/interleaving-string)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming

## Acceptance Rate
41.23%

## Problem Statement
Given strings `s1`, `s2`, and `s3`, find whether `s3` is formed by an interleaving of `s1` and `s2`.

An **interleaving** of two strings `s` and `t` is a configuration where `s` and `t` are divided into `n` and `m` substrings respectively, such that:
- s = s₁ + s₂ + ... + sₙ
- t = t₁ + t₂ + ... + tₘ
- |n - m| ≤ 1
- The interleaving is s₁ + t₁ + s₂ + t₂ + s₃ + t₃ + ... or t₁ + s₁ + t₂ + s₂ + t₃ + s₃ + ...

**Note**: `a + b` is the concatenation of strings `a` and `b`.

## Examples
Example 1:
```
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Explanation: One way to obtain s3 is:
Split s1 into s1 = "aa" + "bc" + "c"
Split s2 into s2 = "dbbc" + "a"
Interleaving the two splits: "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac"
```

Example 2:
```
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
```

Example 3:
```
Input: s1 = "", s2 = "", s3 = ""
Output: true
```

## Constraints
- 0 <= s1.length, s2.length <= 100
- 0 <= s3.length <= 200
- s1, s2, and s3 consist of lowercase English letters

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use dynamic programming to solve this problem
2. Create a 2D DP table where dp[i][j] represents whether s3[0...i+j-1] can be formed by interleaving s1[0...i-1] and s2[0...j-1]
3. For each position (i,j), check if the current character in s3 matches either s1[i-1] or s2[j-1]
4. If it matches s1[i-1], check if dp[i-1][j] is true
5. If it matches s2[j-1], check if dp[i][j-1] is true

</details>
