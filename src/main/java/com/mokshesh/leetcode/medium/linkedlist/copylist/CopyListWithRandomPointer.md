# Copy List with Random Pointer

## LeetCode Link
🔗 [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer)

## Difficulty
Medium

## Topics
- Hash Table
- Linked List

## Acceptance Rate
59.15%

## Problem Statement
A linked list of length `n` is given such that each node contains an additional random pointer, which could point to any node in the list, or `null`.

Construct a deep copy of the list. The deep copy should consist of exactly `n` brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the `next` and `random` pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes `X` and `Y` in the original list, where `X.random --> Y`, then for the corresponding two nodes `x` and `y` in the copied list, `x.random --> y`.

Return the head of the copied linked list.

## Examples
Example 1:
```
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
```

Example 2:
```
Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
```

Example 3:
```
Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
```

## Constraints
- 0 <= n <= 1000
- -10^4 <= Node.val <= 10^4
- Node.random is null or pointing to a node in the linked list

## Hints
<details>
<summary>Click here to see hints</summary>

1. Just iterate the linked list and create copies of the nodes on the go. Since a node can be referenced from multiple nodes due to the random pointers, make sure you are not making multiple copies of the same node.
2. You may want to use extra space to keep old node ---> new node mapping to prevent creating multiple copies of the same node.
3. We can avoid using extra space for old node ---> new node mapping by tweaking the original linked list. Simply interweave the nodes of the old and copied list.

</details>
