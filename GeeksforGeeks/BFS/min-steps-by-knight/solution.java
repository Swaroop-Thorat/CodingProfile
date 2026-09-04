class Solution {
    
    int[] posX={-2,-1,-2,-1,2,1,2,1};
    int[] posY={-1,-2,1,2,-1,-2,1,2};
    class Pair{
        int x;
        int y;
        int steps;
        Pair(int x, int y , int steps){
            this.x=x;
            this.y=y;
            this.steps=steps;
        }
    }
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        
        if(targetPos[0]==knightPos[0] && targetPos[1]==knightPos[1]) return 0;
        Queue<Pair> q=new ArrayDeque<>();
        q.offer(new Pair(knightPos[0]-1,knightPos[1]-1,0));
        boolean[][] vis=new boolean[n][n];
        vis[knightPos[0]-1][knightPos[1]-1]=true;
        while(!q.isEmpty()){
            Pair pair=q.poll();
            
            int x=pair.x;
            int y=pair.y;
            int steps=pair.steps;
            
            for(int i=0;i<8;i++){
                int currX=x+posX[i];
                int currY=y+posY[i];
                
                if(currX<n && currX>=0 && currY<n && currY>=0 && !vis[currX][currY]){
                    vis[currX][currY]=true;
                    q.offer(new Pair(currX,currY,steps+1));
                }
                
                if(currX==targetPos[0]-1 && currY==targetPos[1]-1) return steps+1; 
            }
        }
        
        return -1;
    }
}