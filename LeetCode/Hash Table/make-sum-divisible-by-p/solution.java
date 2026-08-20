class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int ele:nums){
            sum+=ele;
        }
       int tar=(int)(sum%p);
       if(tar==0) return 0;
       Map<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       int len=Integer.MAX_VALUE;
       long Sum=0;
       for(int i=0;i<nums.length;i++){
         Sum=(Sum+nums[i])%p;
         //take running modulo instead of sum
         int needed=(int)((Sum-tar+p)%p);
         if(map.containsKey(needed)){
            int curr=i-map.get(needed);
            len=Math.min(len,curr);
         }
         map.put((int)Sum,i);
       }
       return len==nums.length?-1:len;
    }
}