class Solution {
    // Long memo[][];
    // public int coinChange(int[] coins, int amount) {
    //     memo=new Long[coins.length+1][amount+1];
    //     long result=helper(0,coins,amount);
    //     return result>=Integer.MAX_VALUE?-1:(int)result;
    // }

    // long helper(int i,int[] coins,int amount){
    //     int n=coins.length;
    //     if(amount==0){
    //         return 0;
    //     }
    //     if(i==n-1) {
    //         if (amount%coins[n-1]==0) {
    //             return amount/coins[n-1];
    //         }
    //         return Integer.MAX_VALUE; 
    //     }
    //     if(memo[i][amount]!=null) return memo[i][amount];
    //     long noPick=helper(i+1,coins,amount);

    //     long pick=Integer.MAX_VALUE;
    //     if (coins[i]<=amount){
    //         pick=1+helper(i,coins,amount-coins[i]);
    //     }

    //     return memo[i][amount]=Math.min(pick,noPick);
    // }

    public int coinChange(int[] coins, int amount){
        int n=coins.length;
        long[][] dp=new long[n+1][amount+1];
        for(int i=0;i<amount+1;i++){
            dp[0][i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }

        for(int j=1;j<=n;j++){
            for(int i=1;i<amount+1;i++){
                long noPick=dp[j-1][i];
                long pick=Integer.MAX_VALUE;
                if(coins[j-1]<=i){
                    pick=dp[j][i-coins[j-1]]+1;
                }
                dp[j][i]=Math.min(pick,noPick);
            }
        }
        return (dp[n][amount]>=Integer.MAX_VALUE)?-1:(int)dp[n][amount];
    }
}