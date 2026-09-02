# D. Pair of Topics
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *1400

## Problem Statement
D. Pair of Topics
time limit per test2 seconds
memory limit per test256 megabytes

The next lecture in a high school requires two topics to be discussed. The 
i
𝑖
-th topic is interesting by 
a
i
𝑎
𝑖
 units for the teacher and by 
b
i
𝑏
𝑖
 units for the students.

The pair of topics 
i
𝑖
 and 
j
𝑗
 (
i<j
𝑖
<
𝑗
) is called good if 
a
i
+
a
j
>
b
i
+
b
j
𝑎
𝑖
+
𝑎
𝑗
>
𝑏
𝑖
+
𝑏
𝑗
 (i.e. it is more interesting for the teacher).

Your task is to find the number of good pairs of topics.

Input

The first line of the input contains one integer 
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
) — the number of topics.

The second line of the input contains 
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
9
1
≤
𝑎
𝑖
≤
10
9
), where 
a
i
𝑎
𝑖
 is the interestingness of the 
i
𝑖
-th topic for the teacher.

The third line of the input contains 
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
), where 
b
i
𝑏
𝑖
 is the interestingness of the 
i
𝑖
-th topic for the students.

Output

Print one integer — the number of good pairs of topic.

Examples
input
Copy
5
4 8 2 6 2
4 5 4 1 3

output
Copy
7

input
Copy
4
1 3 2 4
1 3 2 4

output
Copy
0