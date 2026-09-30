class Solution {
    Boolean[][] memo;
    public boolean isMatch(String s, String p) {
        memo=new Boolean[s.length()+1][p.length()+1];
        return f(s,p,0,0);
    }
    boolean f(String s, String p,int i, int j){
        if(i==s.length() && j==p.length()) return memo[i][j]=true;
        
        if(j>=p.length()) return memo[i][j]=false;
         
        if(memo[i][j]!=null) return memo[i][j];
        if(i>=s.length()){
            if(j+1<p.length()){
                if(p.charAt(j)=='*'){
                    return memo[i][j]=f(s,p,i,j+2);
                }
            }
            else{
                return memo[i][j]=false;
            }
        }
        
        boolean match=i<s.length() && (p.charAt(j)=='.' || p.charAt(j)==s.charAt(i));

        if(j+1<p.length() && p.charAt(j+1)=='*'){
          boolean dontConsider=f(s,p,i,j+2);
          boolean consider=false;
          if(match) consider=f(s,p,i+1,j); 

          return memo[i][j]=(consider || dontConsider);
        }
      
        if(match) return memo[i][j]=f(s,p,i+1,j+1);
        return memo[i][j]=false;
    }
}