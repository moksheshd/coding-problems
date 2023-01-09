# Pow(x, n)

## LeetCode Link
🔗 [Pow(x, n)](https://leetcode.com/problems/powx-n)

## Difficulty
Medium

## Topics
- Math
- Recursion

## Acceptance Rate
36.28%

## Problem Statement
Implement `pow(x, n)`, which calculates `x` raised to the power `n` (i.e., `xⁿ`).

## Examples
Example 1:
```
Input: x = 2.00000, n = 10
Output: 1024.00000
```

Example 2:
```
Input: x = 2.10000, n = 3
Output: 9.26100
```

Example 3:
```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2⁻² = 1/2² = 1/4 = 0.25
```

## Constraints
- -100.0 < x < 100.0
- -2³¹ <= n <= 2³¹-1
- n is an integer
- -10⁴ <= xⁿ <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how to handle negative exponents
2. Use the fact that x^n = (x^(n/2))^2 for even n
3. For odd n, x^n = x * x^(n-1)
4. Consider using binary exponentiation for efficiency
5. Be careful about integer overflow when n is very negative

</details>
