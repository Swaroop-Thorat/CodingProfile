class Solution {
    public int[] findOrder(int C, int[][] pre) {
        int[] in=new int[C];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<C;i++) adj.add(new ArrayList<>());
        for(int[] p:pre){
            adj.get(p[0]).add(p[1]);
            in[p[1]]++;
        }
        
        Queue<Integer> q=new ArrayDeque<>();

        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<C;i++){
            if(in[i]==0){
                q.offer(i);
                ans.add(i);
            }
        }


        while(!q.isEmpty()){
            int node=q.poll();

            for(int n:adj.get(node)){
                in[n]--;
                if(in[n]==0){
                    ans.add(n);
                    q.offer(n);
                }
            }
        }
        int[] res=new int[ans.size()];
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return (ans.size()==C)?res:new int[]{};
    }
}