class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(grid[i][j]=='1'){
                bfs(new int[]{i,j},grid);
                res++;
                grid[i][j]='0';
              }
            }
        }
        return res;
    }
    void bfs(int[] start,char[][] grid){
        int n=grid.length,m=grid[0].length;
        int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
        Queue<int[]> q=new ArrayDeque<>();
        q.offer(start);

        while(!q.isEmpty()){
            int[] curr=q.poll();

            for(int i=0;i<4;i++){
                int r=curr[0]+dir[i][0];
                int c=curr[1]+dir[i][1];

                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1'){
                    grid[r][c]='0';
                    q.offer(new int[]{r,c});
                }
            }
        }
    }
}