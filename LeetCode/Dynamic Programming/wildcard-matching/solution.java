class Solution {
    Boolean[][] memo;
    public boolean isMatch(String s, String p) {
        memo=new Boolean[s.length()+1][p.length()+1];
       return match(s,p,0,0);
    }
    boolean match(String s, String p,int i,int j){
        if(i==s.length() && j==p.length()) return true;
        else if(i>=s.length() && j<p.length()){
            if(p.charAt(j)=='*') return match(s,p,i,j+1);
            return false;
        }
        else if(j>=p.length()) return false;
       
        if(memo[i][j]!=null) return memo[i][j];

        boolean ans=false;
        if(i<s.length() && s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            ans=match(s,p,i+1,j+1);
        }
        else if(p.charAt(j)=='*'){
            boolean skip=match(s,p,i,j+1);
            boolean single=match(s,p,i+1,j+1);
            boolean multiple=match(s,p,i+1,j);

            ans=(skip || single || multiple);
        }

        return memo[i][j]=ans;
    }
}