class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        // code here
        
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        
        ArrayList<Integer> dist=new ArrayList<>();
        for(int i=0;i<V;i++) dist.add(Integer.MAX_VALUE);
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        
        dist.set(src,0);
        
        pq.offer(new int[]{src,0});
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int d=curr[1];
            
            if(dist.get(u)<d) continue;
            
            for(int[] n:adj.get(u)){
                int v=n[0];
                int w=n[1];
                
                if(w+dist.get(u)<dist.get(v)){
                    int newW=w+dist.get(u);
                    dist.set(v,newW);
                    pq.offer(new int[]{v,newW});
                }
            }
        }
        return dist;
    }
}