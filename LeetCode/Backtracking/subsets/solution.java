class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return ans;
    }
    void backtracking(int[] nums,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        backtracking(nums,idx+1);
        if(list.size()>0){
            list.remove(list.size()-1);
        }
        backtracking(nums,idx+1);
    }
}