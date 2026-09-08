class Solution {
    public String longestPrefix(String s) {
        int[] lps=new int[s.length()];
        int i=0,j=1;
        while(j<s.length()){
            if(s.charAt(j)==s.charAt(i)){
                lps[j]=i+1;
                j++;
                i++;
            }
            else{
                if(i>0){
                  i=lps[i-1];
                }
                else{
                  lps[j]=0;
                  j++;
                }
            }
        }

        return s.substring(0,lps[s.length()-1]);
    }
}