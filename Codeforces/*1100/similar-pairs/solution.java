import java.lang.*;
import java.util.*;

public class CNumberOfPairs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        long num1=f(arr,(long)r);
        long num2=f(arr,(long)l-1);

        System.out.println(num1-num2);
    }
    static long f(int[] arr,long ele){
        int left=0,right=arr.length-1;
        long count=0;
        while(left<right){
            long sum=arr[left]+arr[right];
            if(sum<=ele){
                count+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}