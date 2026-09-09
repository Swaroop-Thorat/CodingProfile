class Solution {
    int[][] memo;
    public int lengthOfLIS(int[] nums) {
        memo=new int[nums.length+1][nums.length+1];
        for(int i=0;i<=nums.length;i++) Arrays.fill(memo[i],-1);
        return backtracking(nums,0,-1);
    }
    int backtracking(int[] nums,int idx,int prev){
        if(idx==nums.length) return 0;
        
        if(memo[idx][prev+1]!=-1) return memo[idx][prev+1];
        int take=Integer.MIN_VALUE;
        if(prev==-1 || nums[idx]>nums[prev]){
          take=1+backtracking(nums,idx+1,idx);
        }
        int notTake=backtracking(nums,idx+1,prev);

        return memo[idx][prev+1]=Math.max(take,notTake);
    }
}