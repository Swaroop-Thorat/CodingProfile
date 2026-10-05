class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            sum+=num;
            if(sum==goal) res++;

            if(map.containsKey(sum-goal)){
                res+=map.get(sum-goal);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}