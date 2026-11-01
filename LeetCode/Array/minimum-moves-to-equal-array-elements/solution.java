class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i:nums){
            min=Math.min(min,i);
        }

        for(int i:nums){
            ans+=(i-min);
        }
        return ans;
    }
}