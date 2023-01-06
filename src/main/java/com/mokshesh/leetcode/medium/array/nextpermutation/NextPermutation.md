# Next Permutation

## LeetCode Link
🔗 [Next Permutation](https://leetcode.com/problems/next-permutation)

## Difficulty
Medium

## Topics
- Array
- Two Pointers

## Acceptance Rate
42.09%

## Problem Statement
A **permutation** of an array of integers is an arrangement of its members into a sequence or linear order.

The **next permutation** of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the **next permutation** of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example:
- For array `arr = [1,2,3]`, all the permutations are: `[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]`
- The next permutation of `arr = [1,2,3]` is `[1,3,2]`
- Similarly, the next permutation of `arr = [2,3,1]` is `[3,1,2]`

## Examples
Example 1:
```
Input: nums = [1,2,3]
Output: [1,3,2]
```

Example 2:
```
Input: nums = [3,2,1]
Output: [1,2,3]
Explanation: As [3,2,1] is the last permutation, rearrange it to get [1,2,3].
```

Example 3:
```
Input: nums = [1,1,5]
Output: [1,5,1]
```

## Constraints
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 100

## Hints
<details>
<summary>Click here to see hints</summary>

1. Try to find the first pair of adjacent numbers from right to left where nums[i] < nums[i+1]
2. If no such pair exists, reverse the array
3. If found, find the smallest number greater than nums[i] from right side
4. Swap these numbers and reverse the subarray after index i
5. The result will be the next lexicographically greater permutation

</details>
