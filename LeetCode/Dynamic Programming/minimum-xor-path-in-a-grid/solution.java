class Solution {
    Integer[][][] memo;
    public int minCost(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        memo=new Integer[n][m][1024];
        return rec(grid,0,0,0);
    }
    int rec(int[][] grid,int i,int j,int XOR){
        if(i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
        if(memo[i][j][XOR]!=null) return memo[i][j][XOR]; 
        if(i==grid.length-1 && j==grid[0].length-1){
            return XOR^grid[i][j];
        }
        int down=rec(grid,i+1,j,XOR^grid[i][j]);
        int right=rec(grid,i,j+1,XOR^grid[i][j]);

        return memo[i][j][XOR]=Math.min(down,right);
    }
}