class Solution {
    Boolean[][] memo;
    public boolean isMatch(String s, String p) {
        memo=new Boolean[s.length()+1][p.length()+1];
        return rec(s,p,0,0);
    }
    boolean rec(String s,String p,int i,int j){
        if(i==s.length() && j==p.length()) return true;

        if(i>=s.length()){
            if(p.charAt(j)=='*'){
                return rec(s,p,i,j+1);
            }
            return false;
        }
        if(j>=p.length()){
            return false;
        }

        if(memo[i][j]!=null) return memo[i][j];

        boolean res=false;

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            res=rec(s,p,i+1,j+1);
        }
        else if(p.charAt(j)=='*'){
            boolean single=rec(s,p,i+1,j+1);
            boolean multiple=rec(s,p,i+1,j);
            boolean skip=rec(s,p,i,j+1);

            res=single || multiple || skip;
        }
        
        return memo[i][j]=res;
    }
}