# Flatten 2D Vector

## LeetCode Link
🔗 [Flatten 2D Vector](https://leetcode.com/problems/flatten-2d-vector)

## Difficulty
Medium

## Topics
- Array
- Two Pointers
- Design
- Iterator

## Acceptance Rate
49.92%

## Problem Statement
Design an iterator to flatten a 2D vector. It should support the following operations:

- `Vector2D(int[][] vec)` Initializes the object with the 2D vector vec.
- `next()` Returns the next element from the 2D vector.
- `hasNext()` Returns true if there are still some elements in the vector, and false otherwise.

## Examples
Example 1:
```
Input
["Vector2D", "next", "next", "next", "hasNext", "hasNext", "next", "hasNext"]
[[[[1, 2], [3], [4]]], [], [], [], [], [], [], []]
Output
[null, 1, 2, 3, true, true, 4, false]

Explanation
Vector2D vector2D = new Vector2D([[1, 2], [3], [4]]);
vector2D.next();    // return 1
vector2D.next();    // return 2
vector2D.next();    // return 3
vector2D.hasNext(); // return True
vector2D.hasNext(); // return True
vector2D.next();    // return 4
vector2D.hasNext(); // return False
```

## Constraints
- `0 <= vec.length <= 200`
- `0 <= vec[i].length <= 500`
- `-500 <= vec[i][j] <= 500`
- At most `10^5` calls will be made to `next` and `hasNext`

## Hints
<details>
<summary>Click here to see hints</summary>

1. How many variables do you need to keep track of the position in the 2D vector?
2. Think about using two pointers: one for the outer array and one for the inner array.
3. When moving to the next element, what happens when you reach the end of an inner array?
4. Make sure to handle empty inner arrays.

</details>
