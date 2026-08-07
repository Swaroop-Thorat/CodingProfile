# B. From Hero to Zero
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** Math

## Problem Statement
B. From Hero to Zero
time limit per test1 second
memory limit per test256 megabytes

You are given an integer 
n
𝑛
 and an integer 
k
𝑘
.

In one step you can do one of the following moves:

decrease 
n
𝑛
 by 
1
1
;
divide 
n
𝑛
 by 
k
𝑘
 if 
n
𝑛
 is divisible by 
k
𝑘
.

For example, if 
n=27
𝑛
=
27
 and 
k=3
𝑘
=
3
 you can do the following steps: 
27→26→25→24→8→7→6→2→1→0
27
→
26
→
25
→
24
→
8
→
7
→
6
→
2
→
1
→
0
.

You are asked to calculate the minimum number of steps to reach 
0
0
 from 
n
𝑛
.

Input

The first line contains one integer 
t
𝑡
 (
1≤t≤100
1
≤
𝑡
≤
100
) — the number of queries.

The only line of each query contains two integers 
n
𝑛
 and 
k
𝑘
 (
1≤n≤
10
18
1
≤
𝑛
≤
10
18
, 
2≤k≤
10
18
2
≤
𝑘
≤
10
18
).

Output

For each query print the minimum number of steps to reach 
0
0
 from 
n
𝑛
 in single line.

Example
input
Copy
2
59 3
1000000000000000000 10

output
Copy
8
19

Note

Steps for the first test case are: 
59→58→57→19→18→6→2→1→0
59
→
58
→
57
→
19
→
18
→
6
→
2
→
1
→
0
.

In the second test case you have to divide 
n
𝑛
 by 
k
𝑘
 
18
18
 times and then decrease 
n
𝑛
 by 
1
1
.