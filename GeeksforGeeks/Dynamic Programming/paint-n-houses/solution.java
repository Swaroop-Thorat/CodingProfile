class Solution {
    public int distinctColoring(int[] r, int[] g, int[] b) {
        int n=r.length;
        int[][] dp=new int[n+1][4];
        
        for(int idx=n-1;idx>=0;idx--){
            for(int prev=0;prev<4;prev++){
                int red=Integer.MAX_VALUE;
                int green=Integer.MAX_VALUE;
                int blue=Integer.MAX_VALUE;
                
                if(prev!=1) red=dp[idx+1][1]+r[idx];
                if(prev!=2) green=dp[idx+1][2]+g[idx];
                if(prev!=3) blue=dp[idx+1][3]+b[idx];
                
                dp[idx][prev]=Math.min(red,Math.min(blue,green));
            }
        }
        
        
        return dp[0][0];
        
    //     // code here
    //     int n=r.length;
    //     memo=new Integer[n][4];
    //     return rec(0,r,g,b,0);
    // }
    // public int rec(int idx,int[] r, int[] g,int[] b,int prev){
    //     int n=r.length;
    //     if(idx>=n) return 0;
        
    //     if(memo[idx][prev]!=null) return memo[idx][prev];
    //     int red=Integer.MAX_VALUE;
    //     int green=Integer.MAX_VALUE;
    //     int blue=Integer.MAX_VALUE;
        
    //     if(prev!=1){
    //         red=rec(idx+1,r,g,b,1)+r[idx];
    //     }
    //     if(prev!=2){
    //         green=rec(idx+1,r,g,b,2)+g[idx];
    //     }
    //     if(prev!=3){
    //         blue=rec(idx+1,r,g,b,3)+b[idx];
    //     }
        
    //     return memo[idx][prev]=Math.min(red,Math.min(blue,green));
    }
}