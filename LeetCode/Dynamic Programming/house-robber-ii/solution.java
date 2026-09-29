class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp1=new int[n+2];
        int[] dp2=new int[n+2];

        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        dp1[0]=nums[0];
        dp2[1]=nums[1];
        dp1[1]=Math.max(nums[0],nums[1]);
        dp2[2]=Math.max(nums[1],nums[2]);

        for(int i=2;i<n-1;i++){
            int take=nums[i]+dp1[i-2];
            int notTake=dp1[i-1];

            dp1[i]=Math.max(take,notTake);
        }

        for(int i=3;i<n;i++){
            int take=nums[i]+dp2[i-2];
            int notTake=dp2[i-1];

            dp2[i]=Math.max(take,notTake);
        }

        return Math.max(dp1[n-2],dp2[n-1]);
    }
}