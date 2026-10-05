class Solution {
    public long countSubarrays(int[] nums, long k) {
        long res=0;
        long sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(j<=i && sum*(i-j+1)>=k){
                sum-=nums[j];
                j++;
            }
            res+=(i-j+1);
        }
        return res;
    }
}