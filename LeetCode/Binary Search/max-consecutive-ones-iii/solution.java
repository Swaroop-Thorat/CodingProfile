class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0,high=nums.length,len=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,k,mid)){
                len=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return len;
    }
    boolean possible(int[] nums,int k,int mid){
        int count=0;
        for(int i=0;i<mid;i++){
            if(nums[i]==0) count++;
        }
        if(count<=k) return true;
        for(int i=mid;i<nums.length;i++){
        if(nums[i-mid]==0) count--;
        if(nums[i]==0) count++;
        if(count<=k) return true;
        }
        return false;
    }
}