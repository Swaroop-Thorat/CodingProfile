class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tFreq=new HashMap<>();
        Map<Character,Integer> sFreq=new HashMap<>();

       int n=s.length(),m=t.length();
        for(char ch:t.toCharArray()){
          tFreq.put(ch,tFreq.getOrDefault(ch,0)+1);
        }
        
       int i=0,j=0,min=Integer.MAX_VALUE;
       StringBuilder str=new StringBuilder();
       if(m>n) return "";
       
       while(i<n){
        char ch=s.charAt(i);
        if(tFreq.containsKey(ch)) sFreq.put(ch,sFreq.getOrDefault(ch,0)+1);
        i++;

        while(isEqual(tFreq,sFreq)){
            int len=i-j;
            if(len<min){
                str.setLength(0);
                str.append(s.substring(j,i));
                min=len;
            }
            int currFreq=sFreq.getOrDefault(s.charAt(j),0);
            if(currFreq==0){
                j++;
                continue;
            }
            if(currFreq==1) sFreq.remove(s.charAt(j));
            else sFreq.put(s.charAt(j),currFreq-1);
            j++;
        }
       }
       return str.toString();
    }

    boolean isEqual(Map<Character,Integer> tFreq,Map<Character,Integer> sFreq){
        for(char key:sFreq.keySet()){
           if(tFreq.get(key)>sFreq.get(key)) return false;
        }
        return sFreq.size()<tFreq.size()?false:true;
    }
}