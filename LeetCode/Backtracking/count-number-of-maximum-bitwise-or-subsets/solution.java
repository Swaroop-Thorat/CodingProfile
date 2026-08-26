class Solution {
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        int max=findMax(nums,0,0);
        countMax(nums,0,0,max);
        return count;
    }
    int findMax(int[] nums,int idx,int or){
        if(idx==nums.length) return or;
        return Math.max(findMax(nums,idx+1,nums[idx] | or),findMax(nums,idx+1,or));
    }

    int countMax(int[] nums,int idx,int or,int max){
        if(idx==nums.length){
            if(or==max) count++;
            return or;
        }

        return countMax(nums,idx+1,or,max) | countMax(nums,idx+1,nums[idx] | or,max);
    }
}