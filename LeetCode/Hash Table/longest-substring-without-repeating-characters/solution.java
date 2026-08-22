class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int j=0,max=0;
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(map.containsKey(ch)){
            int len=i-j;
            max=Math.max(max,len); 
            j=Math.max(j,map.get(ch)+1);
          } 
         map.put(ch,i);
        }
        max=Math.max(max,s.length()-j);
        return max;
    }
}