class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        Integer[][] arr=new Integer[m][n];

        return rec(arr,0,0,m,n,obstacleGrid);
    }
    int rec(Integer[][] arr,int i,int j,int m,int n,int[][] grid){
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(arr[i][j]!=null) return arr[i][j];

        return arr[i][j]=rec(arr,i,j+1,m,n,grid)+rec(arr,i+1,j,m,n,grid);
    }
}