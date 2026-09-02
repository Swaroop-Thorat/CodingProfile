class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      return atMost(nums,k)-atMost(nums,k-1);
    }

    int atMost(int[] nums,int k){
       HashMap<Integer,Integer> map=new HashMap<>();
       int i=0,j=0,res=0;
       int n=nums.length;

       while(i<n && j<n){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size()>k){
            int val=map.get(nums[j]);
            if(val==1) map.remove(nums[j]);
            else map.put(nums[j],val-1);
            j++;
        }
        
        res+=(i-j+1);
        i++;
       }
       return res;
    }
}