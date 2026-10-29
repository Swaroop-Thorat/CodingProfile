class Solution {
    // Integer[][] memo;
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     memo=new Integer[triangle.size()+1][triangle.size()+1];
    //     return f(triangle,0,0);
    // }
    // int f(List<List<Integer>> tri,int i,int level){
    //     if(level==tri.size()) return 0;

    //     if(memo[i][level]!=null) return memo[i][level];

    //     int res=Math.min(f(tri,i,level+1),f(tri,i+1,level+1));

    //     return memo[i][level]=res+tri.get(level).get(i);
    // }
    public int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        int[][] dp=new int[n][n];
        for(int i=0;i<triangle.get(n-1).size();i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}