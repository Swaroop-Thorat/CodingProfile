# A. Threshold Movement
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *800

## Problem Statement
A. Threshold Movement
time limit per test1 second
memory limit per test256 megabytes

There are 
n+2
𝑛
+
2
 positions numbered from 
0
0
 to 
n+1
𝑛
+
1
. Initially, position 
i
𝑖
 contains an element of weight 
w
i
𝑤
𝑖
 for every 
1≤i≤n
1
≤
𝑖
≤
𝑛
, while positions 
0
0
 and 
n+1
𝑛
+
1
 are empty.

You choose an integer 
k
𝑘
. Then every element moves exactly once, simultaneously:

If 
w
i
<k
𝑤
𝑖
<
𝑘
, the element at position 
i
𝑖
 moves to position 
i−1
𝑖
−
1
;
If 
w
i
>k
𝑤
𝑖
>
𝑘
, the element at position 
i
𝑖
 moves to position 
i+1
𝑖
+
1
;
If 
w
i
=k
𝑤
𝑖
=
𝑘
, the entire movement process fails immediately.

An integer 
k
𝑘
 is perfect if the movement does not fail and, upon completion, every position from 
1
1
 to 
n
𝑛
 contains exactly one element.

Determine whether a perfect integer 
k
𝑘
 exists.

Input

Each test contains multiple test cases. The first line contains the number of test cases 
t
𝑡
 (
1≤t≤500
1
≤
𝑡
≤
500
). The description of the test cases follows.

The first line of each test case contains one integer 
n
𝑛
 (
1≤n≤100
1
≤
𝑛
≤
100
).

The second line of each test case contains 
n
𝑛
 integers 
w
1
,
w
2
,…,
w
n
𝑤
1
,
𝑤
2
,
…
,
𝑤
𝑛
 (
1≤
w
i
≤
10
9
1
≤
𝑤
𝑖
≤
10
9
).

Output

For each test case, print "YES" if a perfect integer 
k
𝑘
 exists, and "NO" otherwise.

You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.

Example
input
Copy
6
1
7
2
3 1
2
2 1
4
9 1 7 2
4
9 8 7 1
6
1000000000 1 9 2 8 3
output
Copy
NO
YES
NO
YES
NO
YES
Note

In the first test case, the only element either leaves position 
1
1
 or has weight equal to 
k
𝑘
, so no suitable integer exists.

In the second test case, choose 
k=2
𝑘
=
2
. The element of weight 
3
3
 moves right and the element of weight 
1
1
 moves left, leaving one element in each position.

In the third test case, keeping both positions occupied would require 
1<k<2
1
<
𝑘
<
2
, which is impossible for an integer 
k
𝑘
.

In the fourth test case, 
k=5
𝑘
=
5
 is suitable: the elements at positions 
1
1
 and 
3
3
 move right, while those at positions 
2
2
 and 
4
4
 move left. Upon completion, every position from 
1
1
 to 
4
4
 contains exactly one element.

In the fifth test case, the element at position 
2
2
 must move left, requiring 
k>8
𝑘
>
8
, while the element at position 
3
3
 must move right, requiring 
k<7
𝑘
<
7
. These requirements are incompatible.

In the sixth test case, choose 
k=4
𝑘
=
4
. All elements at odd positions move right and all elements at even positions move left, so every position from 
1
1
 to 
6
6
 contains one element afterwards.