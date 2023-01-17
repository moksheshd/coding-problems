# Remove Duplicates from Sorted Array II

## LeetCode Link
🔗 [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii)

## Difficulty
Medium

## Topics
- Array
- Two Pointers

## Acceptance Rate
61.73%

## Problem Statement
Given an integer array `nums` sorted in **non-decreasing order**, remove some duplicates **in-place** such that each unique element appears **at most twice**. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array `nums`. More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result. It does not matter what you leave beyond the first `k` elements.

Return `k` after placing the final result in the first `k` slots of `nums`.

Do **not** allocate extra space for another array. You must do this by **modifying the input array in-place** with O(1) extra memory.

## Examples
Example 1:
```
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Example 2:
```
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

## Constraints
- 1 <= nums.length <= 3 * 10⁴
- -10⁴ <= nums[i] <= 10⁴
- nums is sorted in non-decreasing order

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use two pointers to track the position to write and the current element being processed.
2. Keep track of the count of the current element.
3. When count exceeds 2, skip the element.
4. Otherwise, write the element to the position tracked by the first pointer.

</details>
