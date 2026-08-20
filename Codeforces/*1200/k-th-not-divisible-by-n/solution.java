import java.lang.*;
import java.util.*;

public class CKThNotDivisibleByN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sets=k/(n-1);
        long res=n*sets+(k%(n-1));
        if(k%(n-1)==0) res-=1;

        System.out.println(res);
    }
}