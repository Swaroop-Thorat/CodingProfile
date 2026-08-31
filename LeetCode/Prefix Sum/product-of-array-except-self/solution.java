class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=nums[0];
        for(int i=1;i<n;i++){
            res[i]=nums[i]*res[i-1];
        }

        res[n-1]=res[n-2];
        int suff=1;
        for(int i=n-2;i>=0;i--){
            suff*=nums[i+1];
            if(i==0) {res[i]=suff;}
           else { res[i]=suff*res[i-1];}
        }

        return res;
    }
}