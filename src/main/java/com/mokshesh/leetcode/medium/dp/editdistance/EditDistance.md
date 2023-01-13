# Edit Distance

## LeetCode Link
🔗 [Edit Distance](https://leetcode.com/problems/edit-distance)

## Difficulty
Medium

## Topics
- String
- Dynamic Programming

## Acceptance Rate
58.01%

## Problem Statement
Given two strings `word1` and `word2`, return *the minimum number of operations required to convert `word1` to `word2`*.

You have the following three operations permitted on a word:
- Insert a character
- Delete a character
- Replace a character

## Examples
Example 1:
```
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
```

Example 2:
```
Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
```

## Constraints
- 0 <= word1.length, word2.length <= 500
- word1 and word2 consist of lowercase English letters

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use dynamic programming to solve this problem
2. Create a 2D DP table where dp[i][j] represents the minimum operations needed to convert word1[0...i] to word2[0...j]
3. For each character comparison, consider all three operations (insert, delete, replace)
4. Base cases: converting empty string to another string requires length of target string operations
5. Fill the table using the minimum of the three operations at each step

</details>
