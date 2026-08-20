class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
         int ele=st.pop();
         reverseStack(st);
         appendEnd(st,ele);
    }
    static void appendEnd(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        
        int num=st.pop();
        appendEnd(st,ele);
        st.push(num);
    }
}