# Paint House

## LeetCode Link
🔗 [Paint House](https://leetcode.com/problems/paint-house)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming

## Acceptance Rate
63.32%

## Problem Statement
There is a row of n houses, where each house can be painted one of three colors: red, blue, or green. The cost of painting each house with a certain color is different. You have to paint all the houses such that no two adjacent houses have the same color.

The cost of painting each house with a certain color is represented by an n x 3 cost matrix costs.
- For example, `costs[0][0]` is the cost of painting house 0 with the color red; `costs[1][2]` is the cost of painting house 1 with color green, and so on...

Return the minimum cost to paint all houses.

## Examples
Example 1:
```
Input: costs = [[17,2,17],[16,16,5],[14,3,19]]
Output: 10
Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue.
Minimum cost: 2 + 5 + 3 = 10.
```

Example 2:
```
Input: costs = [[7,6,2]]
Output: 2
```

## Constraints
- `costs.length == n`
- `costs[i].length == 3`
- `1 <= n <= 100`
- `1 <= costs[i][j] <= 20`

## Hints
<details>
<summary>Click here to see hints</summary>

1. Consider using dynamic programming to solve this problem.
2. For each house, we need to consider the minimum cost of painting it with each color.
3. The minimum cost for a house depends on the colors used for the previous house.
4. For each house i and color j, calculate the minimum cost to paint houses 0...i with house i painted color j.

</details>
