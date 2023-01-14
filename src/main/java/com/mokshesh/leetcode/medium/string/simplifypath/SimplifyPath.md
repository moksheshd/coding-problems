# Simplify Path

## LeetCode Link
🔗 [Simplify Path](https://leetcode.com/problems/simplify-path)

## Difficulty
Medium

## Topics
- String
- Stack

## Acceptance Rate
46.11%

## Problem Statement
Given an **absolute** path for a Unix-style file system, which always begins with a slash `'/'`, transform this absolute path into its **simplified canonical path**.

In a Unix-style file system:
- A period `'.'` refers to the current directory
- A double period `'..'` refers to the previous/parent directory
- Multiple consecutive slashes `'//'` and `'///'` are treated as a single slash `'/'`
- Any sequence of periods that does not match the rules above should be treated as a valid directory or file name

The **simplified canonical path** should follow these rules:
- The path starts with a single slash `'/'`
- Any two directories are separated by a single slash `'/'`
- The path does not end with a trailing slash `'/'`
- The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period `'.'` or double period `'..'`)

## Examples
Example 1:
```
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
```

Example 2:
```
Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
```

Example 3:
```
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
```

## Constraints
- 1 <= path.length <= 3000
- path consists of English letters, digits, period `'.'`, slash `'/'` or `'_'`
- path is a valid absolute Unix path

## Hints
<details>
<summary>Click here to see hints</summary>

1. Use a stack to store the directory names
2. Split the path by '/' to get individual components
3. Handle '.', '..', and empty strings appropriately
4. For '..', pop from stack if not empty
5. Join the remaining directories with '/' to form the canonical path

</details>
