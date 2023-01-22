# Design Add and Search Words Data Structure

## LeetCode Link
🔗 [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure)

## Difficulty
Medium

## Topics
- String
- Depth-First Search
- Design
- Trie

## Acceptance Rate
46.54%

## Problem Statement
Design a data structure that supports adding new words and finding if a string matches any previously added string.

Implement the `WordDictionary` class:
- `WordDictionary()` Initializes the object.
- `void addWord(word)` Adds `word` to the data structure, it can be matched later.
- `boolean search(word)` Returns `true` if there is any string in the data structure that matches `word`, or `false` otherwise. `word` may contain dots `'.'` where dots can be matched with any letter.

## Examples
```
Input
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
Output
[null,null,null,null,false,true,true,true]

Explanation
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True
```

## Constraints
- `1 <= word.length <= 25`
- `word` in `addWord` consists of lowercase English letters.
- `word` in `search` consists of '.' or lowercase English letters.
- There will be at most `3 * 10^4` calls in total to `addWord` and `search`.

## Hints
<details>
<summary>Click here to see hints</summary>

1. You should be familiar with how a Trie works. If not, please study it first.
2. Think about how to deal with dots in the search query.
3. For dots, we need to try all possible characters.
4. Use DFS/backtracking to try all possibilities when encountering a dot.

</details>
