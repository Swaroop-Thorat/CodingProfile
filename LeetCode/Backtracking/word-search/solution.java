class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean isValid=rec(word,board,vis,i,j,0);
                if (isValid) return true;
            }
        }
        return false;
    }
    boolean rec(String s,char[][] b,boolean[][] vis,int i,int j,int k){
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        int m=b.length,n=b[0].length;
        if(k==s.length()) return true;
        if(i>=m || i<0 || j<0 || j>=n || vis[i][j]) return false;

        if(b[i][j]!=s.charAt(k)) return false;
        vis[i][j]=true;

        boolean valid=false;

        for(int[] d:dir){
            int r=d[0]+i;
            int c=d[1]+j;

            valid=(valid || rec(s,b,vis,r,c,k+1));
        }
        
        vis[i][j]=false;
        return valid;
    }
}