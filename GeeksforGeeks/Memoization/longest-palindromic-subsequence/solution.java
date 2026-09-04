class Solution {
    Integer[][] memo;
    public int longestPalinSubseq(String s) {
        // code here
        memo=new Integer[s.length()][s.length()];
       return backtracking(s,0,s.length()-1);
    }
    
    int backtracking(String s,int i,int j){
        if(i==j) return 1;
        
        if(i>j) return 0;
        
        if(memo[i][j]!=null) return memo[i][j];
        int res=0;
        if(s.charAt(i)==s.charAt(j)){
            res+=backtracking(s,i+1,j-1)+2;
        }
        else{
            res+=Math.max(backtracking(s,i+1,j),backtracking(s,i,j-1));
        }
        
        return memo[i][j]=res;
    }
}