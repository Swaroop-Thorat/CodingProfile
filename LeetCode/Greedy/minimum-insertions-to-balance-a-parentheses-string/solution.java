class Solution {
    public int minInsertions(String s) {
        int res=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                if(open==0){
                    open++;
                    res++;
                    i--;
                    continue;
                }
                else{
                    if(i==s.length()-1 || s.charAt(i+1)=='('){
                        res++;
                    }
                    else{
                        i++;
                    }
                    open--;
                }
            }
        }
        res+=(open*2);
        return res;
    }
}