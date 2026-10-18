// Java CP template

import java.io.*;
import java.util.*;

public class CRumor {

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
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws Exception {
        int V=fs.nextInt();
        int E=fs.nextInt();

        int[] vis=new int[V+1];
        Arrays.fill(vis,-1);

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=V;i++) adj.add(new ArrayList<>());

        int[] coins=new int[V];

        for(int i=0;i<V;i++){
            coins[i]=fs.nextInt();
        }

        for(int i=0;i<E;i++){
           int u=fs.nextInt();
           int v=fs.nextInt();

           adj.get(u).add(v);
           adj.get(v).add(u);
        }

        Stack<Integer> st=new Stack<>();
        int grp=0;

        for(int i=1;i<=V;i++){
            if(vis[i]==-1){
                grp++;
                st.push(i);
                vis[i]=grp;
                while(!st.isEmpty()){
                    int node=st.pop();

                    for(int n:adj.get(node)){
                        if(vis[n]!=-1){
                           vis[n]=grp;
                           st.push(n);
                        }
                    }
                }
            }
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=V;i++){
            int val=map.getOrDefault(vis[i], Integer.MAX_VALUE);
            map.put(vis[i],Math.min(coins[i-1],val));
        }

        int res=0;

        for(int key:map.keySet()){
            int val=map.get(key);
            res+=val;
        }

        out.println(res);
        out.flush();
    }
}