# A. Doremy's Paint 3
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** constructive algorithms

## Problem Statement
A. Doremy's Paint 3
time limit per test1 second
memory limit per test256 megabytes

An array 
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
 of positive integers is good if all the sums of two adjacent elements are equal to the same value. More formally, the array is good if there exists a 
k
𝑘
 such that 
b
1
+
b
2
=
b
2
+
b
3
=…=
b
n−1
+
b
n
=k
𝑏
1
+
𝑏
2
=
𝑏
2
+
𝑏
3
=
…
=
𝑏
𝑛
−
1
+
𝑏
𝑛
=
𝑘
.

Doremy has an array 
a
𝑎
 of length 
n
𝑛
. Now Doremy can permute its elements (change their order) however she wants. Determine if she can make the array good.

Input

The input consists of multiple test cases. The first line contains a single integer 
t
𝑡
 (
1≤t≤100
1
≤
𝑡
≤
100
) — the number of test cases. The description of the test cases follows.

The first line of each test case contains a single integer 
n
𝑛
 (
2≤n≤100
2
≤
𝑛
≤
100
) — the length of the array 
a
𝑎
.

The second line of each test case contains 
n
𝑛
 integers 
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
 (
1≤
a
i
≤
10
5
1
≤
𝑎
𝑖
≤
10
5
).

There are no constraints on the sum of 
n
𝑛
 over all test cases.

Output

For each test case, print "Yes" (without quotes), if it is possible to make the array good, and "No" (without quotes) otherwise.

You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.

Example
input
Copy
5
2
8 9
3
1 1 2
4
1 1 4 5
5
2 3 3 3 3
4
100000 100000 100000 100000
output
Copy
Yes
Yes
No
No
Yes

Note

In the first test case, 
[8,9]
[
8
,
9
]
 and 
[9,8]
[
9
,
8
]
 are good.

In the second test case, 
[1,2,1]
[
1
,
2
,
1
]
 is good because 
a
1
+
a
2
=
a
2
+
a
3
=3
𝑎
1
+
𝑎
2
=
𝑎
2
+
𝑎
3
=
3
.

In the third test case, it can be shown that no permutation is good.