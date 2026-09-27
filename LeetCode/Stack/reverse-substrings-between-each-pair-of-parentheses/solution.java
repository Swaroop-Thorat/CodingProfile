class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
          if(s.charAt(i)==')'){
            while(st.peek()!='('){
                sb.append(st.pop());
            }
            st.pop();
            for(int j=0;j<sb.length();j++){
                st.push(sb.charAt(j));
            }
            sb.setLength(0);
          }
          else{
            st.push(s.charAt(i));
          }
          i++;
        }

        
       StringBuilder res=new StringBuilder();

       for(char c:st){
        res.append(c);
       }

       return res.toString();
    }
}