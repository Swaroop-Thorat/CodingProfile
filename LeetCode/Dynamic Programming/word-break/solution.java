class Solution {
    Boolean memo[];
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()+1];
        Set<String> set=new HashSet<>();
        for(String word:wordDict){
            set.add(word);
        }

        return rec(s,set,0);
    }
    boolean rec(String s,Set<String> set,int i){
        if(i==s.length()) return memo[i]=true;
        boolean res=false;

        if(memo[i]!=null) return memo[i];
        for(int idx=i;idx<s.length();idx++){
            String str=s.substring(i,idx+1);
            if(set.contains(str)){
                res=res || rec(s,set,idx+1);
            }
        }

        return memo[i]=res;
    }
}