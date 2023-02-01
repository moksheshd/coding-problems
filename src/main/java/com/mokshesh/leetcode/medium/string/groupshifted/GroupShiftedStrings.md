# Group Shifted Strings

## LeetCode Link
🔗 [Group Shifted Strings](https://leetcode.com/problems/group-shifted-strings)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- String

## Acceptance Rate
66.79%

## Problem Statement
We can shift a string by shifting each of its letters to its successive letter.
- For example, `"abc"` can be shifted to be `"bcd"`.

We can keep shifting the string to form a sequence.
- For example, we can keep shifting `"abc"` to form the sequence: `"abc" -> "bcd" -> "cde" -> ...`

Given an array of strings `strings`, group all strings[i] that belong to the same shifting sequence. You may return the answer in any order.

## Examples
Example 1:
```
Input: strings = ["abc","bcd","acef","xyz","az","ba","a","z"]
Output: [["acef"],["a","z"],["abc","bcd","xyz"],["az","ba"]]
```

Example 2:
```
Input: strings = ["a"]
Output: [["a"]]
```

## Constraints
- `1 <= strings.length <= 200`
- `1 <= strings[i].length <= 50`
- `strings[i]` consists of lowercase English letters.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to identify strings that are in the same shifting sequence.
2. Two strings are in the same shifting sequence if they have the same pattern of character differences.
3. For each string, compute a key based on the difference between consecutive characters.
4. Use a hash map to group strings with the same difference pattern.

</details>
