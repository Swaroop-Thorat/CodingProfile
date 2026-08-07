# D. Distinct Split
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *1000

## Problem Statement
D. Distinct Split
time limit per test2 seconds
memory limit per test256 megabytes

Let's denote the 
f(x)
𝑓
(
𝑥
)
 function for a string 
x
𝑥
 as the number of distinct characters that the string contains. For example 
f(abc)=3
𝑓
(
abc
)
=
3
, 
f(bbbbb)=1
𝑓
(
bbbbb
)
=
1
, and 
f(babacaba)=3
𝑓
(
babacaba
)
=
3
.

Given a string 
s
𝑠
, split it into two non-empty strings 
a
𝑎
 and 
b
𝑏
 such that 
f(a)+f(b)
𝑓
(
𝑎
)
+
𝑓
(
𝑏
)
 is the maximum possible. In other words, find the maximum possible value of 
f(a)+f(b)
𝑓
(
𝑎
)
+
𝑓
(
𝑏
)
 such that 
a+b=s
𝑎
+
𝑏
=
𝑠
 (the concatenation of string 
a
𝑎
 and string 
b
𝑏
 is equal to string 
s
𝑠
).

Input

The input consists of multiple test cases. The first line contains an integer 
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
) — the number of test cases. The description of the test cases follows.

The first line of each test case contains an integer 
n
𝑛
 (
2≤n≤2⋅
10
5
2
≤
𝑛
≤
2
⋅
10
5
) — the length of the string 
s
𝑠
.

The second line contains the string 
s
𝑠
, consisting of lowercase English letters.

It is guaranteed that the sum of 
n
𝑛
 over all test cases does not exceed 
2⋅
10
5
2
⋅
10
5
.

Output

For each test case, output a single integer  — the maximum possible value of 
f(a)+f(b)
𝑓
(
𝑎
)
+
𝑓
(
𝑏
)
 such that 
a+b=s
𝑎
+
𝑏
=
𝑠
.

Example
input
Copy
5
2
aa
7
abcabcd
5
aaaaa
10
paiumoment
4
aazz
output
Copy
2
7
2
10
3

Note

For the first test case, there is only one valid way to split 
aa
aa
 into two non-empty strings 
a
a
 and 
a
a
, and 
f(a)+f(a)=1+1=2
𝑓
(
a
)
+
𝑓
(
a
)
=
1
+
1
=
2
.

For the second test case, by splitting 
abcabcd
abcabcd
 into 
abc
abc
 and 
abcd
abcd
 we can get the answer of 
f(abc)+f(abcd)=3+4=7
𝑓
(
abc
)
+
𝑓
(
abcd
)
=
3
+
4
=
7
 which is maximum possible.

For the third test case, it doesn't matter how we split the string, the answer will always be 
2
2
.