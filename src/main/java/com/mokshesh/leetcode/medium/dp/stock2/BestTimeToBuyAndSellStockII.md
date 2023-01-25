# Best Time to Buy and Sell Stock II

## LeetCode Link
🔗 [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii)

## Difficulty
Medium

## Topics
- Array
- Dynamic Programming
- Greedy

## Acceptance Rate
68.63%

## Problem Statement
You are given an integer array `prices` where `prices[i]` is the price of a given stock on the `i`th day.

On each day, you may decide to buy and/or sell the stock. You can only hold **at most one** share of the stock at any time. However, you can buy it then immediately sell it on the **same day**.

Find and return *the maximum profit you can achieve*.

## Examples
Example 1:
```
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
```

Example 2:
```
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
```

Example 3:
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No transactions are done and the max profit = 0.
```

## Constraints
- 1 <= prices.length <= 3 * 10⁴
- 0 <= prices[i] <= 10⁴

## Hints
<details>
<summary>Click here to see hints</summary>

1. Think about when you would want to buy and sell the stock
2. If you know the future prices, when would be the best time to buy and sell?
3. Consider a greedy approach - what if you buy and sell whenever you can make a profit?
4. You can buy and sell on the same day, which means you can capture every upward price movement

</details>
