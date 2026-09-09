class Solution {
    Integer[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo=new Integer[text1.length()+1][text2.length()+1];
        return backtracking(text1,text2,0,0);
    }
    int backtracking(String s1,String s2,int i,int j){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(memo[i][j]!=null) return memo[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return memo[i][j]=1+backtracking(s1,s2,i+1,j+1);
        }
        return memo[i][j]=Math.max(backtracking(s1,s2,i,j+1),backtracking(s1,s2,i+1,j));
    }
}