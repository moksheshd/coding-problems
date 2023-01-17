# Majority Element II

## LeetCode Link
🔗 [Majority Element II](https://leetcode.com/problems/majority-element-ii)

## Difficulty
Medium

## Topics
- Array
- Hash Table
- Sorting
- Counting

## Acceptance Rate
53.46%

## Problem Statement
Given an integer array of size `n`, find all elements that appear more than `⌊n/3⌋` times.

## Examples
Example 1:
```
Input: nums = [3,2,3]
Output: [3]
```

Example 2:
```
Input: nums = [1]
Output: [1]
```

Example 3:
```
Input: nums = [1,2]
Output: [1,2]
```

## Constraints
- `1 <= nums.length <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

## Hints
<details>
<summary>Click here to see hints</summary>

1. How many majority elements could it possibly have?
2. Do you know Moore's Voting Algorithm? Try to generalize it.
3. There can be at most two majority elements that appear more than ⌊n/3⌋ times.
4. Consider using two counters to track two potential candidates.

</details>
