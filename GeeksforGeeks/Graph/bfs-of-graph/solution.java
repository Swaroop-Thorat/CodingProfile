class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            
            for(int n:adj.get(node)){
                if(!vis[n]){
                    vis[n]=true;
                    q.offer(n);
                }
            }
        }
        return ans;
    }
}