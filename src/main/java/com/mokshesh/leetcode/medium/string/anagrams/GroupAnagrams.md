# Group Anagrams

## LeetCode Link
🔗 [Group Anagrams](https://leetcode.com/problems/group-anagrams)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- String
- Sorting

## Acceptance Rate
70.14%

## Problem Statement
Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Examples
Example 1:
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

Example 2:
```
Input: strs = [""]
Output: [[""]]
```

Example 3:
```
Input: strs = ["a"]
Output: [["a"]]
```

## Constraints
- 1 <= strs.length <= 10⁴
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider what makes two strings anagrams of each other
2. Two strings are anagrams if they have the same characters with the same frequencies
3. Sort each string to get a canonical form
4. Use a hash map to group strings with the same canonical form
5. The sorted version of each anagram will be identical

</details>
