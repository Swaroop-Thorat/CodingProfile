import java.lang.*;
import java.util.*;

public class CPoisonedDagger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n=sc.nextInt();
        long h=sc.nextLong();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        long low=1,high=h,ans=h;
        while(low<=high){
            long mid=low+(high-low)/2;

            if(possible(mid,arr,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    static boolean possible(long mid,long[] arr,long h){
        long count=0;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                count+=Math.min(mid,arr[i+1]-arr[i]);
            }

        }
        count+=mid;
        return count>=h;
    }
}