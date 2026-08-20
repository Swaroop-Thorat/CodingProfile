class Solution {
    public int subarraysDivByK(int[] nums, int p) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int tar=((sum%p)+p)%p;
            if(map.containsKey(tar)){
                int val=map.get(tar);
                map.put(tar,val+1);
                count+=val;
            }
            else{
                map.put(tar,1);
            }
        }
        return count;
    }
}