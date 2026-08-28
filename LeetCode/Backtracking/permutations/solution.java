class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums,0);
        return ans;
    }
    void backtracking(int[] nums,int idx){
        if(idx==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<nums.length;i++){
            // boolean flag=false;
            // for(int ele:list){
            //     if(ele==nums[i]){ flag=true; break; }
            // } 
            // if(flag) continue;
            // list.add(nums[i]);
            // backtracking(nums,idx+1);
            // list.removeLast();


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