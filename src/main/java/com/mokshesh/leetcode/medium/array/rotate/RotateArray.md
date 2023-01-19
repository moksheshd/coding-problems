# Rotate Array

## LeetCode Link
🔗 [Rotate Array](https://leetcode.com/problems/rotate-array)

## Difficulty
Medium

## Topics
- Array
- Math
- Two Pointers

## Acceptance Rate
42.27%

## Problem Statement
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

## Examples
Example 1:
```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

Example 2:
```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

## Constraints
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
- 0 <= k <= 10^5

## Hints
<details>
<summary>Click here to see hints</summary>

1. The easiest solution would use extra space by creating a new array. Can you solve it without using extra space?
2. Try using the reverse operation. First reverse the entire array, then reverse the first k elements, and finally reverse the remaining elements.
3. Another approach is to move one element at a time, but this might be too slow.
4. Consider using cyclic replacements to move elements to their correct positions.

</details>
