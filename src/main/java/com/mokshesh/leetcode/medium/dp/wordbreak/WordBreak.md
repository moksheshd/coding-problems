# Word Break

## LeetCode Link
🔗 [Word Break](https://leetcode.com/problems/word-break)

## Difficulty
Medium

## Topics
- Hash Table
- String
- Dynamic Programming
- Trie
- Memoization

## Acceptance Rate
47.74%

## Problem Statement
Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

## Examples
Example 1:
```
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
```

Example 2:
```
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
```

Example 3:
```
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
```

## Constraints
- 1 <= s.length <= 300
- 1 <= wordDict.length <= 1000
- 1 <= wordDict[i].length <= 20
- s and wordDict[i] consist of only lowercase English letters
- All the strings of wordDict are unique

## Hints
<details>
<summary>Click here to see hints</summary>

1. The naive approach is to use recursion and backtracking. Check every possible prefix of that string in the dictionary of words, if it exists in the dictionary, then recursively check the remaining portion of the string.
2. Optimize your recursion by using dynamic programming. Cache the results for subproblems.
3. Consider using a trie data structure to efficiently store and search for words in the dictionary.

</details>
