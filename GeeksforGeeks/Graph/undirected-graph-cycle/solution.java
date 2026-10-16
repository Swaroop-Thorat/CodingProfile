class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        boolean[] vis=new boolean[V];
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                q.offer(new int[]{i,-1});
                vis[i]=true;
                
                while(!q.isEmpty()){
                    int[] curr=q.poll();
                    int node=curr[0];
                    int parent=curr[1];
                    
                    for(int n:adj.get(node)){
                        if(!vis[n]){
                            vis[n]=true;
                            q.offer(new int[]{n,node});
                        }
                        else if(parent!=n){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}