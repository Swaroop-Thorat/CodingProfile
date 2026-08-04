# A. Jellyfish and Undertale
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *900

## Problem Statement
A. Jellyfish and Undertale
time limit per test1 second
memory limit per test256 megabytes

Flowey has planted a bomb in Snowdin!

The bomb has a timer that is initially set to 
b
𝑏
. Every second, the timer will decrease by 
1
1
. When the timer reaches 
0
0
, the bomb will explode! To give the residents of Snowdin enough time to evacuate, you will need to delay the bomb from exploding for as long as possible.

You have 
n
𝑛
 tools. Each tool can only be used at most once. If you use the 
i
𝑖
-th tool, the timer will increase by 
x
i
𝑥
𝑖
. However, if the timer is changed to an integer larger than 
a
𝑎
, the timer will be set to 
a
𝑎
 due to a bug.

More specifically, the following events will happen every second in the following order:

You will choose some (possibly none) of your tools that have not been used before. If you choose the 
i
𝑖
-th tool, and the bomb's timer is currently set to 
c
𝑐
, the timer will be changed to 
min(c+
x
i
,a)
min
(
𝑐
+
𝑥
𝑖
,
𝑎
)
.
The timer decreases by 
1
1
.
If the timer reaches 
0
0
, the bomb explodes.

Jellyfish now wants to know the maximum time in seconds until the bomb explodes if the tools are used optimally.

Input

Each test contains multiple test cases. The first line contains the number of test cases 
t
𝑡
 (
1≤t≤2000
1
≤
𝑡
≤
2000
). The description of the test cases follows.

The first line of each test case contains three integers 
a
𝑎
, 
b
𝑏
 and 
n
𝑛
 (
1≤b≤a≤
10
9
1
≤
𝑏
≤
𝑎
≤
10
9
, 
1≤n≤100
1
≤
𝑛
≤
100
) — the maximum value of the bomb's timer, the initial value of the timer of the bomb and the number of tools.

The second line of each test contains 
n
𝑛
 integers 
x
1
,
x
2
,…,
x
n
𝑥
1
,
𝑥
2
,
…
,
𝑥
𝑛
 (
1≤
x
i
≤
10
9
1
≤
𝑥
𝑖
≤
10
9
) — the number the timer can increase by using the 
i
𝑖
-th tool.

Note that the sum of 
n
𝑛
 over all test cases is not bounded.

Output

For each test case, output a single integer — the maximum time in seconds until the bomb explodes.

Example
input
Copy
2
5 3 3
1 1 7
7 1 5
1 2 5 6 8
output
Copy
9
21

Note

Let 
c
𝑐
 denote the value of the bomb's timer. In the first test case:

Second 
1
1
: choose tool 
1
1
 and 
2
2
 at this second, then 
c=5
𝑐
=
5
; the timer decreases by 
1
1
, then 
c=4
𝑐
=
4
.
Second 
2
2
: the timer decreases by 
1
1
, then 
c=3
𝑐
=
3
.
Second 
3
3
: the timer decreases by 
1
1
, then 
c=2
𝑐
=
2
.
Second 
4
4
: the timer decreases by 
1
1
, then 
c=1
𝑐
=
1
.
Second 
5
5
: choose tool 
3
3
, then 
c=5
𝑐
=
5
; the timer decreases by 
1
1
, then 
c=4
𝑐
=
4
.
Second 
6
6
: the timer decreases by 
1
1
, then 
c=3
𝑐
=
3
.
Second 
7
7
: the timer decreases by 
1
1
, then 
c=2
𝑐
=
2
.
Second 
8
8
: the timer decreases by 
1
1
, then 
c=1
𝑐
=
1
.
Second 
9
9
: the timer decreases by 
1
1
, then 
c=0
𝑐
=
0
. The bomb explodes.

It can be proved that there is no way to use the tools such that the bomb explodes after more than 
9
9
 seconds.