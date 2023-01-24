# Maximum Product Subarray

## LeetCode Link
🔗 [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming

## Acceptance Rate
34.42%

## Problem Statement
Given an integer array `nums`, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

## Examples
Example 1:
```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```

Example 2:
```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
```

## Constraints
- 1 <= nums.length <= 2 * 10^4
- -10 <= nums[i] <= 10
- The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Keep track of both maximum and minimum products at each position.
2. Why minimum? Because multiplying a negative number with a negative minimum can give a large positive number.
3. Reset when encountering zero.

</details>
