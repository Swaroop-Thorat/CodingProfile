class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int[] arr:matches){
            int win=arr[0];
            int loss=arr[1];

            map.put(loss,map.getOrDefault(loss,0)+1);
            if(!map.containsKey(win)) map.put(win,0); 
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> oneLoss=new ArrayList<>();
        List<Integer> noLoss=new ArrayList<>();

        for(int key:map.keySet()){
            if(map.get(key)==0){
                noLoss.add(key);
            }
            else if(map.get(key)==1){
                oneLoss.add(key);
            }
        }
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        ans.add(noLoss);
        ans.add(oneLoss);
        return ans;
    }
}