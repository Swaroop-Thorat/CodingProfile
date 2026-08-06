# B. Round Down the Price
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *800

## Problem Statement
B. Round Down the Price
time limit per test1 second
memory limit per test256 megabytes

At the store, the salespeople want to make all prices round.

In this problem, a number that is a power of 
10
10
 is called a round number. For example, the numbers 
10
0
=1
10
0
=
1
, 
10
1
=10
10
1
=
10
, 
10
2
=100
10
2
=
100
 are round numbers, but 
20
20
, 
110
110
 and 
256
256
 are not round numbers.

So, if an item is worth 
m
𝑚
 bourles (the value of the item is not greater than 
10
9
10
9
), the sellers want to change its value to the nearest round number that is not greater than 
m
𝑚
. They ask you: by how many bourles should you decrease the value of the item to make it worth exactly 
10
k
10
𝑘
 bourles, where the value of 
k
𝑘
 — is the maximum possible (
k
𝑘
 — any non-negative integer).

For example, let the item have a value of 
178
178
-bourles. Then the new price of the item will be 
100
100
, and the answer will be 
178−100=78
178
−
100
=
78
.

Input

The first line of input data contains a single integer 
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
) — the number of test cases .

Each test case is a string containing a single integer 
m
𝑚
 (
1≤m≤
10
9
1
≤
𝑚
≤
10
9
) — the price of the item.

Output

For each test case, output on a separate line a single integer 
d
𝑑
 (
0≤d<m
0
≤
𝑑
<
𝑚
) such that if you reduce the cost of the item by 
d
𝑑
 bourles, the cost of the item will be the maximal possible round number. More formally: 
m−d=
10
k
𝑚
−
𝑑
=
10
𝑘
, where 
k
𝑘
 — the maximum possible non-negative integer.

Example
input
Copy
7
1
2
178
20
999999999
9000
987654321
output
Copy
0
1
78
10
899999999
8000
887654321

Note

In the example:

1−0=
10
0
1
−
0
=
10
0
,
2−1=
10
0
2
−
1
=
10
0
,
178−78=
10
2
178
−
78
=
10
2
,
20−10=
10
1
20
−
10
=
10
1
,
999999999−899999999=
10
8
999999999
−
899999999
=
10
8
,
9000−8000=
10
3
9000
−
8000
=
10
3
,
987654321−887654321=
10
8
987654321
−
887654321
=
10
8
.

Note that in each test case, we get the maximum possible round number.