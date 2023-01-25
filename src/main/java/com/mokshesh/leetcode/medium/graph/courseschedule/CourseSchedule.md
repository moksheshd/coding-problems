# Course Schedule

## LeetCode Link
🔗 [Course Schedule](https://leetcode.com/problems/course-schedule)

## Difficulty
Medium

## Topics
- Depth-First Search
- Breadth-First Search
- Graph
- Topological Sort

## Acceptance Rate
48.27%

## Problem Statement
There are a total of `numCourses` courses you have to take, labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [ai, bi]` indicates that you must take course `bi` first if you want to take course `ai`.

For example, the pair `[0, 1]` indicates that to take course `0` you have to first take course `1`.

Return `true` if you can finish all courses. Otherwise, return `false`.

## Examples
Example 1:
```
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
```

Example 2:
```
Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
```

## Constraints
- `1 <= numCourses <= 2000`
- `0 <= prerequisites.length <= 5000`
- `prerequisites[i].length == 2`
- `0 <= ai, bi < numCourses`
- All the pairs `prerequisites[i]` are unique.

## Hints
<details>
<summary>Click here to see hints</summary>

1. This problem is equivalent to detecting a cycle in a directed graph.
2. If there is a cycle, no topological ordering exists and therefore it will be impossible to take all courses.
3. Use DFS to detect if there is a cycle in the graph.
4. Keep track of visited nodes and nodes in the current recursion stack.
5. If a node being visited is already in the recursion stack, then there is a cycle.

</details>
