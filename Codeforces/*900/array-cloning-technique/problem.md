# B. Array Cloning Technique
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *900

## Problem Statement
B. Array Cloning Technique
time limit per test1 second
memory limit per test256 megabytes

You are given an array 
a
𝑎
 of 
n
𝑛
 integers. Initially there is only one copy of the given array.

You can do operations of two types:

Choose any array and clone it. After that there is one more copy of the chosen array.
Swap two elements from any two copies (maybe in the same copy) on any positions.

You need to find the minimal number of operations needed to obtain a copy where all elements are equal.

Input

The input consists of multiple test cases. The first line contains a single integer 
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
) — the number of test cases. Description of the test cases follows.

The first line of each test case contains a single integer 
n
𝑛
 (
1≤n≤
10
5
1
≤
𝑛
≤
10
5
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
−
10
9
≤
a
i
≤
10
9
−
10
9
≤
𝑎
𝑖
≤
10
9
) — the elements of the array 
a
𝑎
.

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

For each test case output a single integer — the minimal number of operations needed to create at least one copy where all elements are equal.

Example
input
Copy
6
1
1789
6
0 1 3 3 7 0
2
-1000000000 1000000000
4
4 3 2 1
5
2 5 7 6 3
7
1 1 1 1 1 1 1
output
Copy
0
6
2
5
7
0

Note

In the first test case all elements in the array are already equal, that's why the answer is 
0
0
.

In the second test case it is possible to create a copy of the given array. After that there will be two identical arrays:

[ 0 1 3 3 7 0 ]
[
 
0
 
1
 
3
 
3
 
7
 
0
 
]
 and 
[ 0 1 3 3 7 0 ]
[
 
0
 
1
 
3
 
3
 
7
 
0
 
]

After that we can swap elements in a way so all zeroes are in one array:

[ 0 
0
–
 
0
–
 3 7 0 ]
[
 
0
 
0
_
 
0
_
 
3
 
7
 
0
 
]
 and 
[ 
1
–
 1 3 3 7 
3
–
 ]
[
 
1
_
 
1
 
3
 
3
 
7
 
3
_
 
]

Now let's create a copy of the first array:

[ 0 0 0 3 7 0 ]
[
 
0
 
0
 
0
 
3
 
7
 
0
 
]
, 
[ 0 0 0 3 7 0 ]
[
 
0
 
0
 
0
 
3
 
7
 
0
 
]
 and 
[ 1 1 3 3 7 3 ]
[
 
1
 
1
 
3
 
3
 
7
 
3
 
]

Let's swap elements in the first two copies:

[ 0 0 0 
0
–
 
0
–
 0 ]
[
 
0
 
0
 
0
 
0
_
 
0
_
 
0
 
]
, 
[ 
3
–
 
7
–
 0 3 7 0 ]
[
 
3
_
 
7
_
 
0
 
3
 
7
 
0
 
]
 and 
[ 1 1 3 3 7 3 ]
[
 
1
 
1
 
3
 
3
 
7
 
3
 
]
.

Finally, we made a copy where all elements are equal and made 
6
6
 operations.

It can be proven that no fewer operations are enough.