# Rectangle Area

## LeetCode Link
🔗 [Rectangle Area](https://leetcode.com/problems/rectangle-area)

## Difficulty
Medium

## Topics
- Math
- Geometry

## Acceptance Rate
47.08%

## Problem Statement
Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.

The first rectangle is defined by its bottom-left corner `(ax1, ay1)` and its top-right corner `(ax2, ay2)`.

The second rectangle is defined by its bottom-left corner `(bx1, by1)` and its top-right corner `(bx2, by2)`.

## Examples
Example 1:
```
Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
Output: 45
```

Example 2:
```
Input: ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
Output: 16
```

## Constraints
- `-10^4 <= ax1 <= ax2 <= 10^4`
- `-10^4 <= ay1 <= ay2 <= 10^4`
- `-10^4 <= bx1 <= bx2 <= 10^4`
- `-10^4 <= by1 <= by2 <= 10^4`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Calculate the area of each rectangle separately.
2. Find the overlapping area between the two rectangles.
3. The total area is the sum of individual areas minus the overlapping area.
4. To find the overlapping area, find the overlapping width and height.
5. The overlapping width is the minimum of the right edges minus the maximum of the left edges.
6. The overlapping height is the minimum of the top edges minus the maximum of the bottom edges.

</details>
