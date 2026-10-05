class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        Integer[][] memo=new Integer[n][m];
         
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               ans+=f(matrix,i,j,memo);
            }
        }
        return ans;
    }
    int f(int[][] mat,int i, int j, Integer[][] memo){
        if(i>=mat.length || j>=mat[0].length || mat[i][j]==0){
           return 0;
        }
        if(memo[i][j]!=null) return memo[i][j];

        int right=f(mat,i,j+1,memo);
        int down=f(mat,i+1,j,memo);
        int dia=f(mat,i+1,j+1,memo);

        return memo[i][j]=1+Math.min(right,Math.min(down,dia));
    }
}