class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length, odd=0,even=0;
        int minEven=Integer.MAX_VALUE,minOdd=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                even++;
                minEven=Math.min(minEven,nums1[i]);
            }
            else{
                odd++;
                minOdd=Math.min(minOdd,nums1[i]);
            }
        }
        if(odd==n || even==n) return true;
        return (odd>0 && minEven-minOdd>=1);
    }
}