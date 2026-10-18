# E. Cyclic Components
**Platform:** Codeforces
**Difficulty:** N/A
**Topic:** *1500

## Problem Statement
E. Cyclic Components
time limit per test2 seconds
memory limit per test256 megabytes

You are given an undirected graph consisting of 
n
𝑛
 vertices and 
m
𝑚
 edges. Your task is to find the number of connected components which are cycles.

Here are some definitions of graph theory.

An undirected graph consists of two sets: set of nodes (called vertices) and set of edges. Each edge connects a pair of vertices. All edges are bidirectional (i.e. if a vertex 
a
𝑎
 is connected with a vertex 
b
𝑏
, a vertex 
b
𝑏
 is also connected with a vertex 
a
𝑎
). An edge can't connect vertex with itself, there is at most one edge between a pair of vertices.

Two vertices 
u
𝑢
 and 
v
𝑣
 belong to the same connected component if and only if there is at least one path along edges connecting 
u
𝑢
 and 
v
𝑣
.

A connected component is a cycle if and only if its vertices can be reordered in such a way that:

the first vertex is connected with the second vertex by an edge,
the second vertex is connected with the third vertex by an edge,
...
the last vertex is connected with the first vertex by an edge,
all the described edges of a cycle are distinct.

A cycle doesn't contain any other edges except described above. By definition any cycle contains three or more vertices.

There are 
6
6
 connected components, 
2
2
 of them are cycles: 
[7,10,16]
[
7
,
10
,
16
]
 and 
[5,11,9,15]
[
5
,
11
,
9
,
15
]
.
Input

The first line contains two integer numbers 
n
𝑛
 and 
m
𝑚
 (
1≤n≤2⋅
10
5
1
≤
𝑛
≤
2
⋅
10
5
, 
0≤m≤2⋅
10
5
0
≤
𝑚
≤
2
⋅
10
5
) — number of vertices and edges.

The following 
m
𝑚
 lines contains edges: edge 
i
𝑖
 is given as a pair of vertices 
v
i
𝑣
𝑖
, 
u
i
𝑢
𝑖
 (
1≤
v
i
,
u
i
≤n
1
≤
𝑣
𝑖
,
𝑢
𝑖
≤
𝑛
, 
u
i
≠
v
i
𝑢
𝑖
≠
𝑣
𝑖
). There is no multiple edges in the given graph, i.e. for each pair (
v
i
,
u
i
𝑣
𝑖
,
𝑢
𝑖
) there no other pairs (
v
i
,
u
i
𝑣
𝑖
,
𝑢
𝑖
) and (
u
i
,
v
i
𝑢
𝑖
,
𝑣
𝑖
) in the list of edges.

Output

Print one integer — the number of connected components which are also cycles.

Examples
input
Copy
5 4
1 2
3 4
5 4
3 5

output
Copy
1

input
Copy
17 15
1 8
1 12
5 11
11 9
9 15
15 5
4 13
3 13
4 3
10 16
7 10
16 7
14 3
14 4
17 6

output
Copy
2

Note

In the first example only component 
[3,4,5]
[
3
,
4
,
5
]
 is also a cycle.

The illustration above corresponds to the second example.