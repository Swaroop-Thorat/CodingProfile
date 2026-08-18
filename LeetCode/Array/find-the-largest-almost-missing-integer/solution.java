class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(n==k){
            int res=nums[0];
            for(int i=0;i<n;i++){
                res=Math.max(res,nums[i]);
            }
            return res;
        }
        int[] count=new int[51];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }

        if(k==1){
            for(int i=50;i>=0;i--){
                if(count[i]==1) return i;
            }
            return -1;
        }
        int res=-1;
        if(count[nums[n-1]]==1){
            res=Math.max(res,nums[n-1]);
        }

        if(count[nums[0]]==1){
            res=Math.max(res,nums[0]);
        }
        return res;
    }
}