class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        StringBuilder tempMax1=new StringBuilder();
        StringBuilder tempMax2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            StringBuilder temp=new StringBuilder();
            int l,r;
               l=i-1;
               r=i+1;
               temp.append(s.charAt(i));

            while(l>=0 && r<=s.length()-1 && s.charAt(l)==s.charAt(r)){
               temp.append(s.charAt(r));
               temp.insert(0,s.charAt(l));
               l--;
               r++;
               
            }
            if(tempMax1.length()<temp.length()){
                tempMax1.setLength(0);
                tempMax1.append(temp);
            }
        }

         for(int i=0;i<s.length();i++){
            StringBuilder temp=new StringBuilder();
            int l,r;
               l=i;
               r=i+1;

            while(l>=0 && r<=s.length()-1 && s.charAt(l)==s.charAt(r)){
               temp.append(s.charAt(r));
               temp.insert(0,s.charAt(l));
               l--;
               r++;
               
            }
            if(tempMax2.length()<temp.length()){
                tempMax2.setLength(0);
                tempMax2.append(temp);
            }
        }  
        
        if(tempMax1.length()>tempMax2.length()){
            return tempMax1.toString();
        }
        return tempMax2.toString();
    }
}