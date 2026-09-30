class Solution {
    public boolean isMatch(String s, String p) {
        return f(s,p,0,0);
    }
    boolean f(String s, String p,int i, int j){
        if(i==s.length() && j==p.length()) return true;
        
        if(j>=p.length()) return false;

        if(i>=s.length()){
            if(j+1<p.length()){
                if(p.charAt(j)=='*'){
                    return f(s,p,i,j+2);
                }
            }
            else{
                return false;
            }
        }
        
        boolean match=i<s.length() && (p.charAt(j)=='.' || p.charAt(j)==s.charAt(i));

        if(j+1<p.length() && p.charAt(j+1)=='*'){
          boolean dontConsider=f(s,p,i,j+2);
          boolean consider=false;
          if(match) consider=f(s,p,i+1,j); 

          return consider || dontConsider;
        }
      
        if(match) return f(s,p,i+1,j+1);
        return false;
    }
}