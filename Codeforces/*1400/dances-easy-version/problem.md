# G1. Dances (Easy version)
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *1400

## Problem Statement
G1. Dances (Easy version)
time limit per test3 seconds
memory limit per test256 megabytes

This is the easy version of the problem. The only difference is that in this version 
m=1
𝑚
=
1
.

You are given two arrays of integers 
a
1
,
a
2
,…,
a
n
𝑎
1
,
𝑎
2
,
…
,
𝑎
𝑛
 and 
b
1
,
b
2
,…,
b
n
𝑏
1
,
𝑏
2
,
…
,
𝑏
𝑛
. Before applying any operations, you can reorder the elements of each array as you wish. Then, in one operation, you will perform both of the following actions, if the arrays are not empty:

Choose any element from array 
a
𝑎
 and remove it (all remaining elements are shifted to a new array 
a
𝑎
),
Choose any element from array 
b
𝑏
 and remove it (all remaining elements are shifted to a new array 
b
𝑏
).

Let 
k
𝑘
 be the final size of both arrays. You need to find the minimum number of operations required to satisfy 
a
i
<
b
i
𝑎
𝑖
<
𝑏
𝑖
 for all 
1≤i≤k
1
≤
𝑖
≤
𝑘
.

This problem was too easy, so the problem author decided to make it more challenging. You are also given a positive integer 
m
𝑚
. Now, you need to find the sum of answers to the problem for 
m
𝑚
 pairs of arrays 
(c[i],b)
(
𝑐
[
𝑖
]
,
𝑏
)
, where 
1≤i≤m
1
≤
𝑖
≤
𝑚
. Array 
c[i]
𝑐
[
𝑖
]
 is obtained from 
a
𝑎
 as follows:

c[i
]
1
=i
𝑐
[
𝑖
]
1
=
𝑖
,
c[i
]
j
=
a
j
𝑐
[
𝑖
]
𝑗
=
𝑎
𝑗
, for 
2≤j≤n
2
≤
𝑗
≤
𝑛
.
Input

Each test consists of multiple test cases. The first line contains a single integer 
t
𝑡
 (
1≤t≤
10
4
1
≤
𝑡
≤
10
4
) - the number of sets of input data. This is followed by their description.

The first line of each test case contains two integers 
n
𝑛
 and 
m
𝑚
 (
2≤n≤
10
5
2
≤
𝑛
≤
10
5
, 
m=1
𝑚
=
1
) - the size of arrays 
a
𝑎
 and 
b
𝑏
 and the constraints on the value of element 
a
1
𝑎
1
.

The second line of each test case contains 
n−1
𝑛
−
1
 integers 
a
2
,…,
a
n
𝑎
2
,
…
,
𝑎
𝑛
 (
1≤
a
i
≤
10
9
1
≤
𝑎
𝑖
≤
10
9
).

The third line of each test case contains 
n
𝑛
 integers 
b
1
,
b
2
,…,
b
n
𝑏
1
,
𝑏
2
,
…
,
𝑏
𝑛
 (
1≤
b
i
≤
10
9
1
≤
𝑏
𝑖
≤
10
9
).

It is guaranteed that the sum of 
n
𝑛
 over all test cases does not exceed 
10
5
10
5
.

Output

For each test case, output the total number of minimum operations for all pairs of arrays 
(
c
i
,b)
(
𝑐
𝑖
,
𝑏
)
.

Example
input
Copy
4
2 1
1
3 2
4 1
5 1 5
3 8 3 3
8 1
4 3 3 2 2 1 1
1 1 1 1 3 3 3 3
9 1
9 2 8 3 7 4 6 5
1 2 3 2 1 4 5 6 5
output
Copy
0
1
4
4

Note

In the first test case for the pair of arrays 
([1,1],[3,2])
(
[
1
,
1
]
,
[
3
,
2
]
)
, the answer is 
0
0
. No operations or reordering of elements are needed.