# Kth Largest Element in an Array

## LeetCode Link
🔗 [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array)

## Difficulty
Medium

## Topics
- Array
- Divide and Conquer
- Sorting
- Heap (Priority Queue)
- Quickselect

## Acceptance Rate
67.48%

## Problem Statement
Given an integer array `nums` and an integer `k`, return the `kth` largest element in the array.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Can you solve it without sorting?

## Examples
Example 1:
```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```

Example 2:
```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
```

## Constraints
- `1 <= k <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about the relationship between the kth largest element and the sorted array.
2. You can solve this problem without sorting the entire array.
3. Consider using a min-heap or max-heap data structure.
4. The QuickSelect algorithm is an optimized approach for this problem.
5. Think about partitioning the array similar to QuickSort, but only exploring one side.

</details>
