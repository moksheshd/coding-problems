# Meeting Rooms II

## LeetCode Link
🔗 [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Sorting
- Heap (Priority Queue)
- Greedy

## Acceptance Rate
51.85%

## Problem Statement
Given an array of meeting time intervals `intervals` where `intervals[i] = [starti, endi]`, return the minimum number of conference rooms required.

## Examples
Example 1:
```
Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2
Explanation: We need two meeting rooms:
Room 1: [0,30]
Room 2: [5,10], [15,20]
```

Example 2:
```
Input: intervals = [[7,10],[2,4]]
Output: 1
Explanation: One room is sufficient since the meetings don't overlap.
```

## Constraints
- `1 <= intervals.length <= 10^4`
- `0 <= starti < endi <= 10^6`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about how we would approach this in a real-world scenario.
2. We need a new room when a meeting overlaps with all existing meetings.
3. We can track the end times of meetings in each room.
4. A meeting can use a room if the room's previous meeting ends before this meeting starts.
5. Consider using a min-heap to track the earliest ending meeting.

</details>
