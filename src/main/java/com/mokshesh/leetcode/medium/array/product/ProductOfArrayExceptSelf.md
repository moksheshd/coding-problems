# Product of Array Except Self

## LeetCode Link
🔗 [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self)

## Difficulty
Medium

## Topics
- Array
- Prefix Sum

## Acceptance Rate
67.26%

## Problem Statement
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

## Examples
Example 1:
```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

Example 2:
```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

## Constraints
- `2 <= nums.length <= 10^5`
- `-30 <= nums[i] <= 30`
- The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

## Hints
<details>
<summary>Click here to see hints</summary>

1. Could you solve this problem without using division?
2. Think about using two arrays: one for prefix products and one for suffix products.
3. The product of all numbers to the left of the current number can be stored in a prefix array.
4. The product of all numbers to the right of the current number can be stored in a suffix array.
5. The final result for each position is the product of the corresponding prefix and suffix values.

</details>
