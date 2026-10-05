class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        Queue<int[]> q=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    fresh++;
                }
                else if(mat[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        
        int time=0;
        
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                
                for(int[] d:dir){
                    int r=curr[0]+d[0];
                    int c=curr[1]+d[1];
                    
                    if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && mat[r][c]==1){
                        mat[r][c]=2;
                        fresh--;
                        q.offer(new int[]{r,c});
                    }
                }
            }
        }
        return (fresh==0)?time:-1;
    }
}