class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtracking(nums,0);
        return ans;
    }
    void backtracking(int[] nums,int idx){ 
        if(idx==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int n:nums) list.add(n);
            ans.add(new ArrayList(list));
            return;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,idx,i);
            backtracking(nums,idx+1);
            swap(nums,idx,i);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}