import java.lang.*;
import java.util.*;

public class EPairOfTopics {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        long ans=0;

        int[] c=new int[n];

        for(int i=0;i<n;i++){
            c[i]=a[i]-b[i];
        }

        Arrays.sort(c);

        int left=0,right=n-1;

        while(left<right){
            int sum=c[left]+c[right];
            if(sum>0){
              ans+=(right-left);
              right--;
            }
            else{
                left++;
            }
        }

        System.out.println(ans);
    }

}