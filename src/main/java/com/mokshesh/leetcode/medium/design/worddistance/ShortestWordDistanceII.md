# Shortest Word Distance II

## LeetCode Link
🔗 [Shortest Word Distance II](https://leetcode.com/problems/shortest-word-distance-ii)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- Two Pointers
- String
- Design

## Acceptance Rate
61.73%

## Problem Statement
Design a data structure that will be initialized with a string array, and then it should answer queries of the shortest distance between two different strings from the array.

Implement the `ShortestWordDistanceII` class:
- `ShortestWordDistanceII(String[] wordsDict)` initializes the object with the strings array `wordsDict`.
- `int shortest(String word1, String word2)` returns the shortest distance between `word1` and `word2` in the array `wordsDict`.

## Examples
Example 1:
```
Input
["ShortestWordDistanceII", "shortest", "shortest"]
[[["practice", "makes", "perfect", "coding", "makes"]], ["coding", "practice"], ["makes", "coding"]]
Output
[null, 3, 1]

Explanation
ShortestWordDistanceII shortestWordDistanceII = new ShortestWordDistanceII(["practice", "makes", "perfect", "coding", "makes"]);
shortestWordDistanceII.shortest("coding", "practice"); // return 3
shortestWordDistanceII.shortest("makes", "coding");    // return 1
```

## Constraints
- `1 <= wordsDict.length <= 3 * 10^4`
- `1 <= wordsDict[i].length <= 10`
- `wordsDict[i]` consists of lowercase English letters.
- `word1` and `word2` are in `wordsDict`.
- `word1 != word2`
- At most `5000` calls will be made to `shortest`.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Store the indices for each word in separate lists.
2. When finding the shortest distance, use two pointers to traverse the lists.
3. Keep track of the minimum distance while traversing.
4. Use a HashMap to store word-to-indices mapping for quick lookup.

</details>
