class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int j=1,k=1;
        for(int i=2;i<nums.length;i++){
            if(arr1[j-1]>arr2[k-1]){
                arr1[j++]=nums[i];
            }
            else{
                arr2[k++]=nums[i];
            }
        }
        k=0;
        for(int i=j;i<nums.length;i++){
            arr1[i]=arr2[k++];
        }
        return arr1;
    }
}