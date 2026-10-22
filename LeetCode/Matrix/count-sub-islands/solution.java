class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid1.length,n=grid1[0].length;
        boolean[][] vis=new boolean[m][n];

        int res=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid2[i][j]==1){
                    int[] flag={0};
                    bfs(vis,grid1,grid2,new int[]{i,j},flag);
                    if(flag[0]==0) res++;
                }
            }
        }
        return res;
    }
    void bfs(boolean[][] vis,int[][] grid1,int[][] grid2,int[] curr,int[] flag){
        int m=grid1.length,n=grid1[0].length;
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};

        Queue<int[]> q=new ArrayDeque<>();
        vis[curr[0]][curr[1]]=true;
        q.offer(curr);

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int i=cur[0],j=cur[1];
            if(grid1[i][j]==0) flag[0]=1;

            for(int d[]:dir){
                int r=d[0]+i;
                int c=d[1]+j;

                if(r>=0 && r<m && c>=0 && c<n && grid2[r][c]==1 && !vis[r][c]){
                    if(grid1[r][c]==0) flag[0]=1;
                    vis[r][c]=true;
                    q.offer(new int[]{r,c});
                }
            }
        }
    }
}