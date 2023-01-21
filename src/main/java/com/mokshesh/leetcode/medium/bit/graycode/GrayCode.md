# Gray Code

## LeetCode Link
🔗 [Gray Code](https://leetcode.com/problems/gray-code)

## Difficulty
Medium

## Topics
- Math
- Backtracking
- Bit Manipulation

## Acceptance Rate
60.92%

## Problem Statement
An **n-bit gray code sequence** is a sequence of 2^n integers where:
- Every integer is in the inclusive range [0, 2^n - 1]
- The first integer is 0
- An integer appears no more than once in the sequence
- The binary representation of every pair of adjacent integers differs by exactly one bit
- The binary representation of the first and last integers differs by exactly one bit

Given an integer `n`, return *any valid n-bit gray code sequence*.

## Examples
Example 1:
```
Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
```

Example 2:
```
Input: n = 1
Output: [0,1]
```

## Constraints
- 1 <= n <= 16

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to generate the sequence iteratively
2. For n-bit numbers, the sequence can be generated from (n-1)-bit sequence
3. Consider how to modify the (n-1)-bit sequence to get the n-bit sequence
4. The first half of the n-bit sequence is the same as (n-1)-bit sequence
5. The second half is the mirror of first half with 1 added as the most significant bit

</details>
