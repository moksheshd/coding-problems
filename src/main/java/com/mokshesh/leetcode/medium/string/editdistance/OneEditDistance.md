# One Edit Distance

## LeetCode Link
🔗 [One Edit Distance](https://leetcode.com/problems/one-edit-distance)

## Difficulty
Medium

## Topics
- String
- Two Pointers

## Acceptance Rate
34.43%

## Problem Statement
Given two strings `s` and `t`, determine if they are both one edit distance apart.

One edit distance means you can:
1. Insert exactly one character into `s` to get `t`
2. Delete exactly one character from `s` to get `t`
3. Replace exactly one character in `s` to get `t`

## Examples
Example 1:
```
Input: s = "ab", t = "acb"
Output: true
Explanation: We can insert 'c' into s to get t.
```

Example 2:
```
Input: s = "cab", t = "ad"
Output: false
Explanation: We cannot get t from s through one edit.
```

Example 3:
```
Input: s = "1203", t = "1213"
Output: true
Explanation: We can replace '0' with '1' to get t.
```

## Constraints
- 0 <= s.length, t.length <= 10^4
- s and t consist of lowercase letters, digits, and symbols.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider the lengths of both strings. What are the possible cases?
2. If the lengths differ by more than 1, they cannot be one edit distance apart.
3. If the lengths are equal, check for exactly one character difference.
4. If the lengths differ by 1, try inserting each possible character at each position.

</details>
