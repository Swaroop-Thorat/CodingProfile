class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        find(candidates,target,0,list,temp);
        return list;
    }
    void find(int[] candidates,int target,int idx, List<List<Integer>> list , List<Integer> temp ){
        if(idx==candidates.length){
            if( 0 == target)
               list.add(new ArrayList<>(temp));
            return;
        }
        if(candidates[idx]<=target){
        temp.add(candidates[idx]);
        find(candidates,target-candidates[idx],idx,list,temp);
        temp.remove(temp.size()-1);
        }
        find(candidates,target,idx+1,list,temp);
    }
}