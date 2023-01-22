# Single Number III

## LeetCode Link
🔗 [Single Number III](https://leetcode.com/problems/single-number-iii)

## Difficulty
Medium

## Topics
- Array
- Bit Manipulation

## Acceptance Rate
70.77%

## Problem Statement
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

## Examples
Example 1:
```
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation: [5,3] is also a valid answer.
```

Example 2:
```
Input: nums = [-1,0]
Output: [-1,0]
```

Example 3:
```
Input: nums = [0,1]
Output: [0,1]
```

## Constraints
- `2 <= nums.length <= 3 * 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`
- Each integer in nums will appear twice, only two integers will appear once.

## Hints
<details>
<summary>Click here to see hints</summary>

1. First, we need to XOR all numbers to get XOR of the two numbers we need to find.
2. The XOR result will give us a number where set bits indicate the positions where the two numbers differ.
3. Find any set bit in this XOR result.
4. Use this bit to divide all numbers into two groups: numbers with this bit set and numbers with this bit not set.
5. XOR numbers in each group separately to find our two single numbers.

</details>
