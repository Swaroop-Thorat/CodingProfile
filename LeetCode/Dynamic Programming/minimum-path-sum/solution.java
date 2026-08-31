class Solution {
    Integer[][] memo;
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        memo=new Integer[m][n];
        return rec(grid,0,0);
    }
    int rec(int[][] grid,int i,int j){
        if(i==grid.length || j==grid[0].length) return Integer.MAX_VALUE;
        if(i== grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(memo[i][j]!=null) return memo[i][j];

        return memo[i][j]=grid[i][j]+Math.min(rec(grid,i+1,j),rec(grid,i,j+1));
    }
}