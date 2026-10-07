class Solution {
    Set<String> ans=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(')');
                }
            }
        }

        int k=st.size();
        if(k==0){
            ans.add(s);
            return new ArrayList<>(ans);
        }

        backtracking(s,0,k,"");

        return new ArrayList<>(ans);
    }

    void backtracking(String s,int idx,int k,String str){
    
        if(k==0 && idx==s.length()){
            if(isValid(str)) ans.add(str);
            return;
        }

        if(idx>=s.length()){
            return;
        }
 
        backtracking(s,idx+1,k,str+s.charAt(idx));
        if(k>0 && (s.charAt(idx)=='(' || s.charAt(idx)==')')) backtracking(s,idx+1,k-1,str);
    }

    boolean isValid(String str){
       int count=0;
        for(char c:str.toCharArray()) {
            if(c=='(') count++;
            else if(c==')'){
                if(count==0) return false;
                count--;
            }
        }
        return count==0;
    }
}