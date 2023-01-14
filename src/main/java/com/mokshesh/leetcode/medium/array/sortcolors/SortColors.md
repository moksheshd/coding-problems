# Sort Colors

## LeetCode Link
🔗 [Sort Colors](https://leetcode.com/problems/sort-colors)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Sorting

## Acceptance Rate
66.08%

## Problem Statement
Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

## Examples
Example 1:
```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

Example 2:
```
Input: nums = [2,0,1]
Output: [0,1,2]
```

## Constraints
- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2

## Follow up
- Could you come up with a one-pass algorithm using only constant extra space?

## Hints
<details>
<summary>Click here to see hints</summary>

1. A rather straight forward solution is a two-pass algorithm using counting sort.
2. First, iterate the array counting number of 0's, 1's, and 2's.
3. Then overwrite array with total number of 0's, then 1's and followed by 2's.
4. Could you solve this problem without using the count? Try using the Dutch National Flag Algorithm.

</details>
