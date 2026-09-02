import java.lang.*;
import java.util.*;

public class ABearAndBigBrother {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res=0;

        while(a<=b){
            a*=3;
            b*=2;
            res++;
        }
        System.out.println(res);
    }
}