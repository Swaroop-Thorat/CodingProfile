# GFG. Multiply Two Linked Lists
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** Linked List

## Problem Statement
Given the heads of two singly linked lists L1 and L2, where each node stores a single digit of a non-negative integer, return the product of the two numbers represented by the linked lists. Since the answer can be very large, return it modulo 10^9 + 7.

Note: The digits are stored in the same order as the number (most significant digit first).

Examples :

Input: L1 = 3 -> 2 , L2 = 2
Output: 64
Explanation: 

Multiplication of 32 and 2 gives 64.

Input: L1 = 1 -> 0 -> 0, L2 = 1 -> 0
Output: 1000
Explanation: 

Multiplication of 100 and 10 gives 1000.

Constraints:
1 ≤ number of nodes ≤ 10^5
0 ≤ node->data ≤ 9