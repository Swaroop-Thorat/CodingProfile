class Solution {
    // public int uniquePaths(int m, int n) {
    //     Integer[][] memo=new Integer[m][n];
    //     return rec(m,n,0,0,arr);
    // }
    // int rec(int m ,int n,int i,int j,Integer[][] memo){
    //     if(i==m-1 || j==n-1) return 1;
    //     if(memo[i][j]!=null){
    //         return memo[i][j];
    //     }

    //     return memo[i][j]=rec(m,n,i+1,j,arr)+rec(m,n,i,j+1,arr);
    // }
    public int uniquePaths(int m, int n){
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                int down=(i+1>=m)?0:dp[i+1][j];
                int right=(j+1>=n)?0:dp[i][j+1];

                dp[i][j]=right+down;
            }
        }
        return dp[0][0];
    }
}