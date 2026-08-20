class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
            int ele=st.pop();
            sortStack(st);
            sortIt(st,ele);
    }
    static void sortIt(Stack<Integer> st,int ele){
        
        if(st.isEmpty() || st.peek()<=ele){
            st.push(ele);
            return;
        }
        
        int num=st.pop();
        sortIt(st,ele);
        st.push(num);
    }
}