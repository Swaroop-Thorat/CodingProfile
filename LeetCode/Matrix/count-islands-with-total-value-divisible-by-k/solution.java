class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length,m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0 && dfs(grid,i,j)%k==0) count++;
            }
        }
        return count;
    }
    long dfs(int[][] grid,int i,int j){
        int n=grid.length,m=grid[0].length;
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        long sum=grid[i][j];
        grid[i][j]=0;

        for(int[] d:dir){
            int r=d[0]+i;
            int c=d[1]+j;

            if(r>=0 && r<n && c>=0 && c<m && grid[r][c]!=0){
                sum+=dfs(grid,r,c);
            }
        }
        return sum;
    }
}