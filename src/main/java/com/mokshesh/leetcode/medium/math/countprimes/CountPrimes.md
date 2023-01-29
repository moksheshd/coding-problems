# Count Primes

## LeetCode Link
🔗 [Count Primes](https://leetcode.com/problems/count-primes)

## Difficulty
Medium

## Topics
- Math
- Number Theory
- Sieve of Eratosthenes

## Acceptance Rate
34.34%

## Problem Statement
Given an integer `n`, return the number of prime numbers that are strictly less than `n`.

## Examples
Example 1:
```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
```

Example 2:
```
Input: n = 0
Output: 0
```

Example 3:
```
Input: n = 1
Output: 0
```

## Constraints
- `0 <= n <= 5 * 10⁶`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use the Sieve of Eratosthenes algorithm to efficiently find all prime numbers up to n.
2. Start by marking all numbers as potential primes (not composite).
3. For each number p starting from 2, mark all its multiples as composite.
4. You only need to check up to sqrt(n) when marking multiples.
5. Finally, count the numbers that remain marked as prime.

</details>
