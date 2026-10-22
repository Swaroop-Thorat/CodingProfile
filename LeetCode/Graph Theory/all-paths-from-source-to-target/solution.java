class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();

        dfs(graph,ans,new ArrayList<>(),0);

        return ans;
    }
    void dfs(int[][] g,List<List<Integer>> ans,List<Integer> list,int node){
        int n=g.length;
        list.add(node);

        if(list.get(list.size()-1)==n-1){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int neig:g[node]){
            dfs(g,ans,list,neig);
            list.remove(list.size()-1);
        }

    }
}