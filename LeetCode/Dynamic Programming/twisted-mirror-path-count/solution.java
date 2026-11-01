class Solution {
    Integer memo[][][];
    long mod=(int)1e9 + 7;

    int rec(int grid[][],int r,int c,int d) {
        if(r==grid.length-1 && c==grid[0].length-1) return 1;

        if(r>=grid.length||c>=grid[0].length) return 0;

        if(memo[r][c][d]!=null) return memo[r][c][d];

        if(grid[r][c]==1){
            if(d==0) return memo[r][c][d]=rec(grid,r+1,c,1);
            else return memo[r][c][d]=rec(grid,r,c+1,0);
        }

        return memo[r][c][d]=(int)((rec(grid,r+1,c,1)+rec(grid,r,c+1,0))%mod);
    }

    public int uniquePaths(int[][] grid){
        memo=new Integer[grid.length][grid[0].length][2];
        return rec(grid,0,0,0);
    }
}