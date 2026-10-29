class Solution {
    // Integer[][] memo;
    // public int minFallingPathSum(int[][] matrix) {
    //     int n=matrix.length;
    //     int min=Integer.MAX_VALUE;
    //     memo=new Integer[n][n];
    //     for(int i=0;i<n;i++){
    //         memo[0][i]=rec(matrix,0,i);
    //     }

    //     for(int i=0;i<n;i++){
    //         min=Math.min(memo[0][i],min);
    //     }

    //     return min;
    // }
    // int rec(int[][] mat,int i,int j){
    //     int n=mat.length;
    //     if(i>=n || j>=n || i<0 || j<0) return Integer.MAX_VALUE;
    //     if(i==n-1) return mat[i][j];
    //     if(memo[i][j]!=null) return memo[i][j];

    //     int left=rec(mat,i+1,j-1);
    //     int right=rec(mat,i+1,j+1);
    //     int down=rec(mat,i+1,j);

    //     return memo[i][j]=mat[i][j]+Math.min(left,Math.min(right,down));
    // }

    public int minFallingPathSum(int[][] matrix){
        int n=matrix.length;
        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            dp[n-1][i]=matrix[n-1][i];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int right=(j+1>=n)?Integer.MAX_VALUE:dp[i+1][j+1];
                int left=(j-1<0)?Integer.MAX_VALUE:dp[i+1][j-1];
                int down=dp[i+1][j];

                dp[i][j]=matrix[i][j]+Math.min(down,Math.min(left,right));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}