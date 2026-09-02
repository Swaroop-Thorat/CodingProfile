class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();

       map.put(0,1);
       int res=0,odd=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0) odd++;
        int compliment=odd-k;
        if(map.containsKey(compliment)){
            res+=map.get(compliment);
        }
        map.put(odd,map.getOrDefault(odd,0)+1);
       } 
       return res;
    }
}