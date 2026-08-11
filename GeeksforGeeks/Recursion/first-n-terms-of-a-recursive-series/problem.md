# GFG. First n Terms of a Recursive Series
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** Recursion

## Problem Statement
Geek made a special series that follows recurrence  Tn = (Tn-2)2 - (Tn-1). The first (or T1)  and the second term (or T2) are 0 and 1 respectively.

Given an integer n, return the first n terms of the series.


Examples

Input: n = 3
Output: [0, 1, -1]
Explanation: First-term is given as 0 and the second term is 1. So the T3 = (T3-2)2 - (T3-1) = T12 - T2 = 02 - 1 = -1
Input: n = 6
Output: [0, 1, -1, 2, -1, 5]
Explanation:
T1 : 0
T2 : 1
T3 : -1
T4 = (1)2 - (-1) = 2
T5 = (-1)2 - (2) = 1 - 2 = -1
T6 = (2)2 - (-1) = 4 + 1 = 5