class Solution {
    // Integer[][] memo;
    // public int minPathSum(int[][] grid) {
    //     int m=grid.length,n=grid[0].length;
    //     memo=new Integer[m][n];
    //     return rec(grid,0,0);
    // }
    // int rec(int[][] grid,int i,int j){
    //     if(i==grid.length || j==grid[0].length) return Integer.MAX_VALUE;
    //     if(i== grid.length-1 && j==grid[0].length-1){
    //         return grid[i][j];
    //     }

    //     if(memo[i][j]!=null) return memo[i][j];

    //     return memo[i][j]=grid[i][j]+Math.min(rec(grid,i+1,j),rec(grid,i,j+1));
    // }
    public int minPathSum(int[][] grid){
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=grid[m-1][n-1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                int down=(i+1>=m)?Integer.MAX_VALUE:dp[i+1][j];
                int right=(j+1>=n)?Integer.MAX_VALUE:dp[i][j+1];
                dp[i][j]=grid[i][j]+Math.min(down,right);
            }
        }
        return dp[0][0];
    }
}