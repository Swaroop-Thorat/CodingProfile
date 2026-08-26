class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=1,high=nums.length,len=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,target)){
                high=mid-1;
                len=mid;
            }
            else{
                low=mid+1;
            }
        }
        return len;
    }
    boolean possible(int[] nums,int mid,int tar){
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<mid;i++){
            sum+=nums[i];
        }
        if(sum>=tar) return true;
        for(int i=mid;i<nums.length;i++){
            sum-=nums[i-mid];
            sum+=nums[i];
            if(sum>=tar) return true;
        }
        return false;
    }
}