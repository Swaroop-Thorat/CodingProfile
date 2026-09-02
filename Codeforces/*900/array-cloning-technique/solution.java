import java.lang.*;
import java.util.*;

public class BArrayCloningTechnique {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Map<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int max=0;

        for(int key:map.keySet()){
            int val=map.get(key);
            max=Math.max(max,val);
        }

        if(map.size()==1){
            System.out.println(0);
            return;
        }
        int res=n-max;

        int remaining=res;
        int decrease=max;
        while(remaining>0){
           remaining-=decrease;
           decrease*=2;
           res++;
        }
        System.out.println(res);
    }
}