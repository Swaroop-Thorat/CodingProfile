class Solution {
    public int subsetXORSum(int[] nums) {
       return rec(nums,0,0); 
    }
    int rec(int[] nums,int idx,int xor){
        if(idx==nums.length) return xor;
        
        return rec(nums,idx+1,xor^nums[idx])+rec(nums,idx+1,xor);
    }
}