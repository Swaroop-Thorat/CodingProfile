class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean vis[]=new boolean[n];

        dfs(vis,0,rooms);

        for(int i=0;i<n;i++){
           if(!vis[i]) return false;
        }
        return true;
    }
    void dfs(boolean[] vis,int node,List<List<Integer>> adj){
        vis[node]=true;

        for(int n:adj.get(node)){
            if(n==node) continue;
            if(!vis[n]){
                dfs(vis,n,adj);
            }
        }

    }
}