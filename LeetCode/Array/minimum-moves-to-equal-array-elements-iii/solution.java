class Solution {
    public int minMoves(int[] nums) {
        int min1=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        for(int n:nums){
            min1+=(max-n);
        }
        return min1;
    }
}