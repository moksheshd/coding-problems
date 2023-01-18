# Longest Consecutive Sequence

## LeetCode Link
🔗 [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- Union Find

## Acceptance Rate
47.35%

## Problem Statement
Given an unsorted array of integers `nums`, return *the length of the longest consecutive elements sequence*.

You must write an algorithm that runs in `O(n)` time.

## Examples
Example 1:
```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```

Example 2:
```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

## Constraints
- 0 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how you can determine if a number is the start of a sequence
2. For each number, would you need to check if it has a left neighbor?
3. Use a HashSet for O(1) lookups
4. Only start counting sequence length from numbers that have no left neighbor

</details>
