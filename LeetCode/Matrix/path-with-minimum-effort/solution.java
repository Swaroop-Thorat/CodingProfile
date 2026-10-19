class Solution {
    public int minimumEffortPath(int[][] h) {
        int m = h.length, n = h[0].length;
        
        int[][] dist=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dist[i],Integer.MAX_VALUE);

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        q.offer(new int[]{m-1,n-1,0});

        dist[m-1][n-1]=0;

        int[][] dir={{0,-1},{-1,0},{1,0},{0,1}};

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int i=curr[0];
            int j=curr[1];
            if(curr[2]>dist[i][j]) continue;

            for(int[] d:dir){
                int r=i+d[0];
                int c=j+d[1];

                if(r>=m || r<0 || c<0 || c>=n) continue;

                int diff=Math.abs(h[r][c]-h[i][j]);
                int newDiff=Math.max(diff,dist[i][j]);

                if(newDiff<dist[r][c]){
                    dist[r][c]=newDiff;
                    q.offer(new int[]{r,c,newDiff});
                }
            }
        }
        return dist[0][0];
    }       
}