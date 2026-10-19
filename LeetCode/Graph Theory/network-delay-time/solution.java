class Solution {
    public int networkDelayTime(int[][] times, int N, int k) {
        List<List<int[]>> adj=new ArrayList<>();

        for(int i=0;i<=N;i++) adj.add(new ArrayList<>());

        for(int t[]:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];

            adj.get(u).add(new int[]{v,w});
        }

        int[] dist=new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        pq.offer(new int[]{k,0});
        dist[k]=0;

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int d=curr[1];

            if(dist[u]<d) continue;

            for(int[] n:adj.get(u)){
                int v=n[0];
                int w=n[1];

                if(w+dist[u]<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        int ans=-1;
        for(int i=1;i<=N;i++){
            ans=Math.max(dist[i],ans);
        }

        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}