# GFG. Segregate Evens and Odds in a Linked List
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** Linked List

## Problem Statement
Given the head of a singly linked list, rearrange the list in place so that all nodes containing even values appear before nodes containing odd values. Return the head of the modified linked list.

Note: The relative order of the even nodes and the odd nodes should remain unchanged.

Examples:

Input:
 
Output: 8 -> 2 -> 4 -> 6 -> 17 -> 15 -> 9
Explanation: Since 8, 2, 4, and 6 are even, they appear first in the list, followed by the odd numbers 17, 15, and 9.


Input:
 
Output: 1 -> 3 -> 5 -> 7
Explanation: There is no even number, so no modification is needed.



Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105