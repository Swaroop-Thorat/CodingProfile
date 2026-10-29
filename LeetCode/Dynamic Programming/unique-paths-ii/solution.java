class Solution {
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length,n=obstacleGrid[0].length;
    //     Integer[][] memo=new Integer[m][n];

    //     return rec(memo,0,0,m,n,obstacleGrid);
    // }
    // int rec(Integer[][] memo,int i,int j,int m,int n,int[][] grid){
    //     if(i>=m || j>=n) return 0;
    //     if(grid[i][j]==1) return 0;
    //     if(i==m-1 && j==n-1) return 1;
    //     if(memo[i][j]!=null) return memo[i][j];

    //     return memo[i][j]=rec(memo,i,j+1,m,n,grid)+rec(memo,i+1,j,m,n,grid);
    // }
    public int uniquePathsWithObstacles(int[][] ob){
        int m=ob.length,n=ob[0].length;
        int[][] dp=new int[m][n];
        if(ob[m-1][n-1]!=1) dp[m-1][n-1]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                if(ob[i][j]==1) continue;
                int down=(i+1>=m)?0:dp[i+1][j];
                int right=(j+1>=n)?0:dp[i][j+1];
                dp[i][j]=right+down;
            }
        }
        return dp[0][0];
    }
}