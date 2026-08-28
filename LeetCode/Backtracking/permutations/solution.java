class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums,0);
        return ans;
    }
    void backtracking(int[] nums,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            for(int ele:list){
                if(ele==nums[i]){ flag=true; break; }
            } 
            if(flag) continue;
            list.add(nums[i]);
            backtracking(nums,idx+1);
            list.removeLast();
        }
    }
}