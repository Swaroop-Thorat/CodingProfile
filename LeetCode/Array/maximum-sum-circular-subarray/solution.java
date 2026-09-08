class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=nums[0],max=nums[0],min=nums[0];
        int currMax=nums[0],currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            total+=nums[i];
             
            currMax=Math.max(currMax+nums[i],nums[i]); 
            max=Math.max(max,currMax);

            currMin=Math.min(currMin+nums[i],nums[i]);
            min=Math.min(currMin,min);
        }
        if(max<0) return max;

        int MAX=total-min;

        return Math.max(max,MAX);
    }
}