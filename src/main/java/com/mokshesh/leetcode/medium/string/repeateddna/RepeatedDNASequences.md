# Repeated DNA Sequences

## LeetCode Link
🔗 [Repeated DNA Sequences](https://leetcode.com/problems/repeated-dna-sequences)

## Difficulty
Medium

## Topics
- String
- Hash Table
- Sliding Window
- Bit Manipulation
- Rolling Hash

## Acceptance Rate
50.51%

## Problem Statement
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.

When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

## Examples
Example 1:
```
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
```

Example 2:
```
Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
```

## Constraints
- 1 <= s.length <= 10^5
- s[i] is either 'A', 'C', 'G', or 'T'.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a sliding window of size 10 to get all possible 10-letter sequences
2. Use a HashSet to track sequences you've seen before
3. Use another HashSet to track sequences that appear more than once
4. Consider using bit manipulation to optimize space (each nucleotide can be represented with 2 bits)

</details>
