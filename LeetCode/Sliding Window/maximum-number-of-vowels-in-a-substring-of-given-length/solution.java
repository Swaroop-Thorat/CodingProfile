class Solution {
    public int maxVowels(String s, int k) {
      int curr=0;  
      int max=0;  
      for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') curr++;
      }
      max=Math.max(max,curr);
      for(int i=k;i<s.length();i++){
        char ch=s.charAt(i-k);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') curr--;

        ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') curr++;

        max=Math.max(max,curr);

      }

      return max;
    }
}