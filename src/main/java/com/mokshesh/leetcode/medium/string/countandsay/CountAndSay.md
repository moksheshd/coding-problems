# Count and Say

## LeetCode Link
🔗 [Count and Say](https://leetcode.com/problems/count-and-say)

## Difficulty
Medium

## Topics
- String
- Recursion

## Acceptance Rate
57.61%

## Problem Statement
The **count-and-say** sequence is a sequence of digit strings defined by the recursive formula:

- `countAndSay(1) = "1"`
- `countAndSay(n)` is the way you would "say" the digit string from `countAndSay(n-1)`, which is then converted into a different digit string.

To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, followed by the digit. Finally, concatenate every said digit.

For example, to say the digit string `"3322251"`:
- Two 3's: `"23"`
- Three 2's: `"32"`
- One 5: `"15"`
- One 1: `"11"`
Thus the compressed string becomes `"23321511"`.

Given a positive integer `n`, return the `nth` term of the **count-and-say** sequence.

## Examples
Example 1:
```
Input: n = 1
Output: "1"
Explanation: This is the base case.
```

Example 2:
```
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "1211"
```

## Constraints
- 1 <= n <= 30

## Hints
<details>
<summary>Click here to see hints</summary>

1. Create a recursive function that builds the sequence
2. For each step, count consecutive occurrences of each digit
3. Use StringBuilder to build the result efficiently
4. Handle each group of same digits separately
5. Remember that you're converting how you would "say" the previous result

</details>
