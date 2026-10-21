class Solution {
    int cost=Integer.MAX_VALUE;
    int[][] memo;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] f:flights){
            adj.get(f[0]).add(new int[]{f[1],f[2]});
        }

        memo=new int[n][k+1];

        for(int m[]:memo){
            Arrays.fill(m,Integer.MAX_VALUE);
        }

        dfs(src,dst,0,k+1,adj,0);
        return (cost==Integer.MAX_VALUE)?-1:cost;
    }
    void dfs(int src,int dst,int stop,int k,List<List<int[]>> adj,int currCost){
        if(stop>k) return;

        if(stop==k){
            if(src==dst){
                cost=Math.min(cost,currCost);
            }
            return;
        }
        if(currCost>cost) return;

        if(memo[src][stop]<=currCost) return;
        memo[src][stop]=currCost;

        if(src==dst){
            cost=Math.min(cost,currCost);
            return;
        }

        for(int[] n:adj.get(src)){
            dfs(n[0],dst,stop+1,k,adj,currCost+n[1]);
        }
    }
}