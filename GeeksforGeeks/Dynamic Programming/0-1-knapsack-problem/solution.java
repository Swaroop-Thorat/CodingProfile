class Solution {
    int[][] memo;
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        memo=new int[val.length+1][W+1];
        for(int i=0;i<val.length;i++) Arrays.fill(memo[i],-1);
        return backtracking(W,val,wt,val.length-1);
    }
    int backtracking(int w,int[] val,int[] wt,int idx){
        if(w==0) return 0;
        if(idx==0){
            if(w>=wt[0]) return val[0];
            return 0;
        }
        
        if(memo[idx][w]!=-1) return memo[idx][w];
        
        int take=Integer.MIN_VALUE;
        if(wt[idx]<=w){
         take=val[idx]+backtracking(w-wt[idx],val,wt,idx-1);
        }
        int notTake=backtracking(w,val,wt,idx-1);
        
        return memo[idx][w]=Math.max(take,notTake);
    }
}