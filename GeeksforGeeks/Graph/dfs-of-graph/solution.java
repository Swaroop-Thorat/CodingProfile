class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        boolean[] vis=new boolean[adj.size()];
        
        while(!st.isEmpty()){
            int node=st.pop();
            if(vis[node]) continue;
            res.add(node);
            vis[node]=true;
            int size=adj.get(node).size();
            for(int i=size-1;i>=0;i--){
                int curr=adj.get(node).get(i);
                if(!vis[curr]){
                    st.push(curr);
                }
            }
        }
        
        return res;
    }
}