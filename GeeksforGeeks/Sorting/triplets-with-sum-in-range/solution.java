class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        Arrays.sort(arr);
        int up=threeSum(arr,r);
        int lo=threeSum(arr,l-1);
        
        return up-lo;
    }
    int threeSum(int[] arr,int tar){
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int num=arr[i];
            int j=i+1,k=arr.length-1;
            while(j<k){
                if(num+arr[j]+arr[k]<=tar){
                    count+=(k-j);
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return count;
    }
}