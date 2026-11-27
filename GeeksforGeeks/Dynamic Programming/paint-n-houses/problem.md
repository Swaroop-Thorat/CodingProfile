# GFG. Paint N Houses
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** Dynamic Programming

## Problem Statement
There are n houses arranged in a row. Each house must be painted using exactly one of three colors: red, green, or blue.
The cost of painting the i-th house with each color is given by three arrays:

r[i] — cost of painting house i red
g[i] — cost of painting house i green
b[i] — cost of painting house i blue

Paint all the houses such that no two adjacent houses have the same color.
Return the minimum total cost required to paint all n houses while satisfying this condition.

Examples:

Input: r[] = [1, 1, 1], g[] = [2, 2, 2], b[] = [3, 3, 3]
Output: 4
Explanation: For the three houses, the cheapest valid coloring is RGR. The total cost is 1 + 2 + 1 = 4. 
Although painting all three houses red would have a total cost of 3, 
this is not allowed because two adjacent houses cannot have the same color.
Input: r[] = [2, 1, 3], g[] = [3, 2, 1], b[] = [1, 3, 2] 
Output: 3
Explanation: A minimum-cost valid coloring is BRG. The corresponding costs are 1, 1, and 1, giving a total cost of 3. 
No two adjacent houses have the same color, so the coloring satisfies the required condition.