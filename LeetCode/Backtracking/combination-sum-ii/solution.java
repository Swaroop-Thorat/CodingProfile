class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        f(candidates,target,new ArrayList<>(),0);
        return ans;
    }
    void f(int[] can,int tar,List<Integer> list,int idx){
        if(tar<0) return;
        if(tar==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<can.length;i++){
            if(i>idx && can[i]==can[i-1]) continue;
            list.add(can[i]);
            f(can,tar-can[i],list,i+1);
            list.remove(list.size()-1);
        }
    }
}