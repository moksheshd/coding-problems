# Insert Interval

## LeetCode Link
🔗 [Insert Interval](https://leetcode.com/problems/insert-interval)

## Difficulty
Medium

## Topics
- Array
- Sorting
- Intervals

## Acceptance Rate
42.79%

## Problem Statement
You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the ith interval and `intervals` is sorted in ascending order by `starti`. You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.

Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return `intervals` after the insertion.

## Examples
Example 1:
```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
```

Example 2:
```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
```

## Constraints
- 0 <= intervals.length <= 10⁴
- intervals[i].length == 2
- 0 <= starti <= endi <= 10⁵
- intervals is sorted by starti in ascending order
- newInterval.length == 2
- 0 <= start <= end <= 10⁵

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider three cases for each interval in the input:
   - Current interval ends before new interval starts
   - Current interval starts after new interval ends
   - Current interval overlaps with new interval
2. Handle each case appropriately:
   - Add current interval to result if it's before new interval
   - Add merged interval if there's overlap
   - Add remaining intervals after new interval is fully processed
3. Keep track of whether the new interval has been inserted
4. Remember to merge overlapping intervals when necessary

</details>
