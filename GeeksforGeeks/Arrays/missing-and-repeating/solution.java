class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int dup=0;
        int mis=0;
        int sum=0,curr=0;
        for(int i=0;i<arr.length;i++){
            sum+=(i+1);
            curr+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
           int num=Math.abs(arr[i]);
           if(arr[num-1]>0){
               arr[num-1]*=(-1);
           }
           else{
               dup=Math.abs(num);
           }
        }
        mis=sum-(curr-dup);
        ArrayList<Integer> res=new ArrayList<>(Arrays.asList(dup,mis));
        return res;
    }
}