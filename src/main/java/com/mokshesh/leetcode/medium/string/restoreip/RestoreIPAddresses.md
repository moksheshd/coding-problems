# Restore IP Addresses

## LeetCode Link
🔗 [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses)

## Difficulty
Medium

## Topics
- String
- Backtracking

## Acceptance Rate
52.11%

## Problem Statement
A **valid IP address** consists of exactly four integers separated by single dots. Each integer is between `0` and `255` (inclusive) and cannot have leading zeros.

For example:
- "0.1.2.201" and "192.168.1.1" are **valid** IP addresses
- "0.011.255.245", "192.168.1.312" and "192.168@1.1" are **invalid** IP addresses

Given a string `s` containing only digits, return *all possible valid IP addresses that can be formed by inserting dots into `s`*. You are **not** allowed to reorder or remove any digits in `s`. You may return the valid IP addresses in **any** order.

## Examples
Example 1:
```
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
```

Example 2:
```
Input: s = "0000"
Output: ["0.0.0.0"]
```

Example 3:
```
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
```

## Constraints
- 1 <= s.length <= 20
- s consists of digits only

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use backtracking to try all possible combinations of dots
2. For each segment, check if it's a valid IP number (0-255, no leading zeros)
3. Keep track of the number of segments created
4. Only add dots if the remaining string has enough digits for valid segments
5. Consider edge cases like strings with all zeros

</details>
