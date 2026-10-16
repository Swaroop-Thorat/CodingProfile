class Solution {
    public boolean containsCycle(char[][] grid) {
      int n=grid.length,m=grid[0].length;
      boolean[][] vis=new boolean[n][m];
      Queue<int[]> q=new ArrayDeque<>();

      int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(vis[i][j]) continue;
            q.offer(new int[]{i,j,-1,-1});
            vis[i][j]=true;

            while(!q.isEmpty()){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                int parentRow=curr[2];
                int parentCol=curr[3];
                char ch=grid[row][col];

                for(int[] d:dir){
                    int r=d[0]+row;
                    int c=d[1]+col;

                    if(r<n && r>=0 && c<m && c>=0 && grid[r][c]==ch){
                        if(!vis[r][c]){
                            vis[r][c]=true;
                            q.offer(new int[]{r,c,row,col});
                        }
                        else if(r!=parentRow || c!=parentCol){
                            return true;
                        }
                    }
                }
            }
        }
      }
      return false;
    }
}