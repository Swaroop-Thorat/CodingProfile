class Solution {
    public int minInsertions(String s) {
        int res=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    st.push('(');
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
                    st.pop();
                }
            }
        }
        res+=(st.size()*2);
        return res;
    }
}