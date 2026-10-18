// Java CP template

import java.io.*;
import java.util.*;

public class ECyclicComponents {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }

        String next() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int V=fs.nextInt();
        int E=fs.nextInt();

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=V;i++) adj.add(new ArrayList<>());

        for(int i=0;i<E;i++){
            int u=fs.nextInt();
            int v=fs.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int count=0;
        boolean[] vis=new boolean[V+1];

        for(int i=1;i<=V;i++){
            if(!vis[i]){
                if(dfs(i,vis,adj)) count++;
            }
        }

        System.out.print(count);
    }

    static boolean dfs(int node,boolean[] vis,List<List<Integer>> adj) throws Exception {
        vis[node]=true;

        boolean isValid=adj.get(node).size()==2;

        for(int n:adj.get(node)){
            if(!vis[n]){
                if(!dfs(n,vis,adj)) isValid=false;
            }
        }
        return isValid;
    }
}