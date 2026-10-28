class Solution {
    Integer[] memo;
    public int numDecodings(String s) {
        memo=new Integer[s.length()+1];
        return s.length()==0?0:rec(s,0);
    }
    int rec(String s,int i){
        if(i==s.length()){
            return 1;
        }

        if(memo[i]!=null) return memo[i];
        if(s.charAt(i)=='0') return 0;

        int single=rec(s,i+1);
        int db=0;
        if(i<s.length()-1){
            int num=Integer.parseInt(s.substring(i,i+2));
            if(num>=1 && num<=26) db=rec(s,i+2);
        }

        return memo[i]=single+db;
    }
}