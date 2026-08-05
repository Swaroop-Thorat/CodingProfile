# A. Simons and Making It Beautiful
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *800

## Problem Statement
A. Simons and Making It Beautiful
time limit per test1 second
memory limit per test256 megabytes

Those cling-on troubles that ride my stride — cough up the fee, or step aside.
— SHUN, TAKE IT AWAY

For a permutation
∗
∗
 
r
𝑟
 of length 
m
𝑚
, we call an index 
i
𝑖
 (
1≤i≤m
1
≤
𝑖
≤
𝑚
) ugly if and only if 
i=max({
r
1
,
r
2
,…,
r
i
})
𝑖
=
max
(
{
𝑟
1
,
𝑟
2
,
…
,
𝑟
𝑖
}
)
.

Simons has a permutation 
p
𝑝
 of length 
n
𝑛
, and he can perform the following operation on 
p
𝑝
 at most once:

Choose two indices 
i
𝑖
 and 
j
𝑗
 (
1≤i≠j≤n
1
≤
𝑖
≠
𝑗
≤
𝑛
), then swap 
p
i
𝑝
𝑖
 and 
p
j
𝑝
𝑗
.

Find a permutation 
q
𝑞
 that can be obtained from 
p
𝑝
 by performing the above operation at most once, such that the number of ugly indices in 
q
𝑞
 is minimized.

∗
∗
A permutation of length 
n
𝑛
 is an array consisting of 
n
𝑛
 distinct integers from 
1
1
 to 
n
𝑛
 in arbitrary order. For example, 
[2,3,1,5,4]
[
2
,
3
,
1
,
5
,
4
]
 is a permutation, but 
[1,2,2]
[
1
,
2
,
2
]
 is not a permutation (
2
2
 appears twice in the array), and 
[1,3,4]
[
1
,
3
,
4
]
 is also not a permutation (
n=3
𝑛
=
3
 but there is 
4
4
 in the array).

Input

Each test contains multiple test cases. The first line contains the number of test cases 
t
𝑡
 (
1≤t≤100
1
≤
𝑡
≤
100
). The description of the test cases follows.

The first line contains an integer 
n
𝑛
 (
1≤n≤500
1
≤
𝑛
≤
500
) — the length of 
p
𝑝
.

The second line contains 
n
𝑛
 integers 
p
1
,
p
2
,…,
p
n
𝑝
1
,
𝑝
2
,
…
,
𝑝
𝑛
 (
1≤
p
i
≤n
1
≤
𝑝
𝑖
≤
𝑛
, all 
p
i
𝑝
𝑖
-s are distinct) — the elements of 
p
𝑝
.

Output

For each test case, print 
n
𝑛
 integers 
q
1
,
q
2
,…,
q
n
𝑞
1
,
𝑞
2
,
…
,
𝑞
𝑛
 — the permutation you found.

If there are multiple possible permutations, you may output any.

Example
input
Copy
5
2
1 2
4
2 3 1 4
5
3 2 4 5 1
1
1
8
4 1 3 2 6 7 8 5
output
Copy
2 1
2 4 1 3
3 2 4 5 1
1
4 1 3 8 6 7 2 5
Note

In the first test case, Simons can obtain only two possible permutations: 
[1,2]
[
1
,
2
]
 and 
[2,1]
[
2
,
1
]
.

For permutation 
[1,2]
[
1
,
2
]
, we can see 
1=max({1})
1
=
max
(
{
1
}
)
 and 
2=max({1,2})
2
=
max
(
{
1
,
2
}
)
. So there are two ugly indices.
For permutation 
[2,1]
[
2
,
1
]
, we can see 
1≠max({2})
1
≠
max
(
{
2
}
)
 and 
2=max({2,1})
2
=
max
(
{
2
,
1
}
)
. So there is only one ugly index.

Thus, permutation 
[2,1]
[
2
,
1
]
 has the minimum count of ugly indices.

In the second test case, Simons can obtain permutation 
[2,4,1,3]
[
2
,
4
,
1
,
3
]
 by choosing indices 
2
2
 and 
4
4
 to swap. There is only one ugly index in the permutation:

1≠max({2})
1
≠
max
(
{
2
}
)
, so index 
1
1
 is not ugly;
2≠max({2,4})
2
≠
max
(
{
2
,
4
}
)
, so index 
2
2
 is not ugly;
3≠max({2,4,1})
3
≠
max
(
{
2
,
4
,
1
}
)
, so index 
3
3
 is not ugly;
4=max({2,4,1,3})
4
=
max
(
{
2
,
4
,
1
,
3
}
)
, so index 
4
4
 is ugly.

In the third test case, note that Simons does not perform the operation.