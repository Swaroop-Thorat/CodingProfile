class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;

        Queue<int[]> q=new ArrayDeque<>();
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || i==n-1 || j==0 || j==m-1) && grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;
                }
            }
        }

        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int[] d:dir){
                int r=curr[0]+d[0];
                int c=curr[1]+d[1];
                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                    q.offer(new int[]{r,c});
                    grid[r][c]=0;
                }
            }
        }
        int res=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) res++;
            }
        }
        return res;
    }
}