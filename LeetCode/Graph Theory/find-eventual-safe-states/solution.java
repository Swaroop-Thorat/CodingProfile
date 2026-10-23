class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        int[] out=new int[n];

        for(int i=0;i<n;i++){
            out[i]=graph[i].length;
            for(int j=0;j<out[i];j++){
                adj.get(graph[i][j]).add(i);
            }
        }

        Queue<Integer> q=new ArrayDeque<>();
        boolean safe[]=new boolean[n];

        for(int i=0;i<n;i++){
            if(out[i]==0) q.offer(i);
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            safe[curr]=true;

            for(int nei:adj.get(curr)){
                out[nei]--;

                if(out[nei]==0){
                    q.offer(nei);
                }
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(safe[i]) ans.add(i);
        }
        return ans;
    }
}