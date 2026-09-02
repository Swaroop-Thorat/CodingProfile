import java.lang.*;
import java.util.*;

public class DChatOrder {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        Stack<String> st=new Stack<>();
        for(int i=0;i<n;i++){
            String str=sc.next();
            st.push(str);
        }

        Set<String> set=new HashSet<>();
        while(!st.isEmpty()){
            String str=st.pop();
            if(!set.contains(str)){
                System.out.println(str);
            }
            set.add(str);
        }
    }
}