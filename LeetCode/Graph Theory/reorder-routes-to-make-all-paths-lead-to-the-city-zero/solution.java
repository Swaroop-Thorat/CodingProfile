class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> udg=new ArrayList<>();
        List<Set<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++) udg.add(new ArrayList<>());
        for(int i=0;i<n;i++) adj.add(new HashSet<>());

        for(int[] c:connections){
            adj.get(c[0]).add(c[1]);

            udg.get(c[0]).add(c[1]);
            udg.get(c[1]).add(c[0]);
        }

        int res=0;

        boolean[] vis=new boolean[n];

        Queue<Integer> q=new ArrayDeque<>();
        q.offer(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int node=q.poll();
            for(int nei:udg.get(node)){
                if(!vis[nei]){
                    if(!adj.get(nei).contains(node)) res++;
                    vis[nei]=true;
                    q.offer(nei);
                }
            }
        }
        return res;
    }
}