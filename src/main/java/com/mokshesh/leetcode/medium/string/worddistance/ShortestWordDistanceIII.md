# Shortest Word Distance III

## LeetCode Link
🔗 [Shortest Word Distance III](https://leetcode.com/problems/shortest-word-distance-iii)

## Difficulty
Medium

## Topics
- Array
- String

## Acceptance Rate
58.83%

## Problem Statement
Given a string array `wordsDict` and two strings `word1` and `word2`, return the shortest distance between these two words in the list.

Note that `word1` and `word2` may be the same. In this case, we should return the shortest distance between the same word.

## Examples
Example 1:
```
Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
Output: 1
```

Example 2:
```
Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "makes"
Output: 3
```

## Constraints
- `1 <= wordsDict.length <= 3 * 10^4`
- `1 <= wordsDict[i].length <= 10`
- `wordsDict[i]` consists of lowercase English letters.
- `word1` and `word2` are in `wordsDict`.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Keep track of the last seen positions of both words.
2. When the words are different, calculate distance as usual.
3. When the words are same, keep track of two most recent positions.
4. Update the minimum distance whenever a word is found.

</details>
