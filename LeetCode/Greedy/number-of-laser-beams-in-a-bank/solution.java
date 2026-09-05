class Solution {
    public int numberOfBeams(String[] bank) {
       int prev=0,res=0;

       for(String st:bank){
        int count=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1') count++;
        }

        if(count>0){
            res+=prev*count;
            prev=count;
        }
       } 

       return res;
    }
}