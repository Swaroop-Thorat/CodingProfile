class Solution {
    public int maxValidSplits(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<nums.length+1;i++){
            int[] pre=new int[n+1];
            int[] suff=new int[n+1];
            
            pre[0]=0;
            suff[n]=0;

            for(int j=1;j<n+1;j++){
                if(i==j-1){
                    pre[j]=pre[j-1];
                    continue;
                }
                pre[j]=gcd(pre[j-1],nums[j-1]);
            }

            for(int j=n-1;j>=0;j--){
                if(i==j){
                    suff[j]=suff[j+1];
                    continue;
                }
                suff[j]=gcd(suff[j+1],nums[j]);
            }

            int count=0;

            for(int j=1;j<n;j++){
                if(i==j) continue;
                if(suff[j]==pre[j]) count++;
            }
            res=Math.max(count,res);
        }
        return res;
    }
    int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}