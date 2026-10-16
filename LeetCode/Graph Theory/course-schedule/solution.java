class Solution {
    public boolean canFinish(int C, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<C;i++) adj.add(new ArrayList<>());

        for(int[] p:pre){
            adj.get(p[0]).add(p[1]);
        }

        boolean[] vis=new boolean[C];
        boolean[] recPath=new boolean[C];

        for(int i=0;i<C;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,recPath)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int node,List<List<Integer>> adj,boolean[] vis,boolean[] recPath){
        vis[node]=true;
        recPath[node]=true;

        for(int n:adj.get(node)){
            if(!vis[n]){
                if(dfs(n,adj,vis,recPath)) return true;
            }
            else if(recPath[n]){
                return true;
            }
        }
        recPath[node]=false;
        return false;
    }
}