class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<int[]> q=new ArrayDeque<>();
        int count=0;
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                    grid[i][j]=1;
                    boolean valid=true;
                    if(i==0 || j==0 || i==n-1 || j==m-1) valid=false;
                    while(!q.isEmpty()){
                        int[] curr=q.poll();

                        for(int[] d:dir){
                            int r=d[0]+curr[0];
                            int c=d[1]+curr[1];


                            if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==0){

                                if(r==0 || c==0 || r==n-1 || c==m-1) valid=false;

                                q.offer(new int[]{r,c});
                                grid[r][c]=1;
                            }
                        }
                    }
                    if(valid) count++;
                }
            }
        }
        return count;
    }
}