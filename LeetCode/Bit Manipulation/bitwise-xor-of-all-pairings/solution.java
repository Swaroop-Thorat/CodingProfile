class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0;
        int xor2=0;

        if(nums1.length%2!=0){
            for(int ele:nums2){
                xor1^=ele;
            }
        }

        if(nums2.length%2!=0){
            for(int ele:nums1){
                xor2^=ele;
            }
        }

        return xor1^xor2;
    }
}