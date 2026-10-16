class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
        }
        
        boolean[] recPath=new boolean[V];
        boolean[] vis=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
              boolean hasCycle=dfs(adj,i,vis,recPath);
              if(hasCycle) return true;
            }
        }
        return false;
    }
    boolean dfs(List<List<Integer>> adj,int node,boolean[] vis,boolean[] recPath){
        vis[node]=true;
        recPath[node]=true;
        
        for(int n:adj.get(node)){
            if(!vis[n]){
                if(dfs(adj,n,vis,recPath)) return true;
            }
            else if(recPath[n]){
                return true;
            }
        }
        
        recPath[node]=false;
        return false;
    }
}