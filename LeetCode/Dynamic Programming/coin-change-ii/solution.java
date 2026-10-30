class Solution {
    // Long memo[][];
    // public int change(int amount,int[] coins) {
    //     memo=new Long[coins.length+1][amount+1];
    //     long result=helper(0,coins,amount);
    //     return (int)result;
    // }

    // long helper(int i,int[] coins,int amount){
    //     int n=coins.length;
    //     if(amount==0){
    //         return 1;
    //     }
    //     if(i==n-1) {
    //         if (amount%coins[n-1]==0) {
    //             return 1;
    //         }
    //         return 0; 
    //     }
    //     if(memo[i][amount]!=null) return memo[i][amount];
    //     long noPick=helper(i+1,coins,amount);

    //     long pick=0;
    //     if (coins[i]<=amount){
    //         pick=helper(i,coins,amount-coins[i]);
    //     }

    //     return memo[i][amount]=pick+noPick;
    // }

    public int change(int amount,int[] coins){
        int n=coins.length;
        long[][] dp=new long[n+1][amount+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=amount;j++){
                long noPick=dp[i-1][j];
                long pick=0;
                if(coins[i-1]<=j){
                    pick=dp[i][j-coins[i-1]];
                }
                dp[i][j]=pick+noPick;
            }
        }
        return (int)dp[n][amount];
    }
}