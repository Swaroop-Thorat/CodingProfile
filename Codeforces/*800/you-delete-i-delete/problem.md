# A. You Delete, I Delete
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *800

## Problem Statement
A. You Delete, I Delete
time limit per test1 second
memory limit per test256 megabytes

Alice and Bob are given a binary string
∗
∗
 
s
𝑠
 of length 
n
𝑛
. It contains at least one 
0
0
 and at least one 
1
1
.

They each perform exactly one operation in the following order:

First, Alice chooses an occurrence of 
0
0
 in 
s
𝑠
 and deletes it.
Then, Bob chooses an occurrence of 
1
1
 in the resulting string and deletes it.

Alice wants the final string to be lexicographically
†
†
 as large as possible, while Bob wants it to be lexicographically as small as possible. Determine the final string if both players act optimally.

∗
∗
A binary string is a string consisting only of the characters 
0
0
 and 
1
1
.

†
†
For two distinct binary strings 
a
𝑎
 and 
b
𝑏
 of the same length, 
a
𝑎
 is lexicographically smaller than 
b
𝑏
 if, at the first position where they differ, 
a
𝑎
 has the smaller digit.

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

The only line of each test case contains a binary string 
s
𝑠
 of length 
n
𝑛
 (
3≤n≤100
3
≤
𝑛
≤
100
).

It is guaranteed that 
s
𝑠
 contains at least one 
0
0
 and at least one 
1
1
.

Output

For each test case, output the final string if both players act optimally.

Example
input
Copy
4
101
11001
0010
0101010000010100100101
output
Copy
1
101
00
01010000010100100101
Note

In the first test case, Alice must delete the only 
0
0
. Bob may delete either occurrence of 
1
1
, so the resulting string is 
1
1
.

In the second test case, Alice may delete either occurrence of 
0
0
. Bob optimally deletes one of the first two occurrences of 
1
1
, so the resulting string is 
101
101
.

In the third test case, Alice may delete any occurrence of 
0
0
. Bob then deletes the only occurrence of 
1
1
, so the resulting string is 
00
00
.