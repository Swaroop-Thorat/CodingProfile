class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums,0);
        return ans;
    }
    void backtracking(int[] nums, int idx){
        if(nums.length==idx){
            ans.add(new ArrayList(list));
            return;
        }

        list.add(nums[idx]);
        backtracking(nums,idx+1);
        if(list.size()>0) list.remove(list.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;
        backtracking(nums,idx+1);
    }
}