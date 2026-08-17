class Solution {
    public int minCapability(int[] nums, int k) {
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        for(int num:nums){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(mid,nums,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    boolean possible(int mid,int[] nums,int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
                i++;
            }
        }
        return count>=k;
    }
}