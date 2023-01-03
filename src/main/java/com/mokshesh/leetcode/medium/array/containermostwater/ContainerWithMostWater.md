# Container With Most Water

## LeetCode Link
🔗 [Container With Most Water](https://leetcode.com/problems/container-with-most-water)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Greedy

## Acceptance Rate
56.96%

## Problem Statement
You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return *the maximum amount of water a container can store*.

**Notice** that you may not slant the container.

## Examples
Example 1:
![Container With Most Water Example](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)
```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```

## Constraints
- n == height.length
- 2 <= n <= 10⁵
- 0 <= height[i] <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. The area of water is determined by the height of the shorter line and the distance between the lines
2. Try using two pointers, starting from the leftmost and rightmost lines
3. Move the pointer pointing to the shorter line inward, as this might lead to a larger area

</details>
