class Solution {
    public int minMoves2(int[] nums) {
        int min1=0, min2=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int num=nums[nums.length/2];
        for(int n:nums){
            min1+=Math.abs(n-num);
        }
        if(nums.length%2==0){
            min2=0;
            num=nums[nums.length/2 - 1];
            for(int n:nums){
                min2+=Math.abs(n-num);
            }
        }
        return Math.min(min1,min2);
    }
}