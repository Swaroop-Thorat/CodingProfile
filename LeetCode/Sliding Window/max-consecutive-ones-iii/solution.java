class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,curr=0,j=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(k>0 && nums[i]==0){
                dq.offerLast(i);
                k--;
            }
            else if(k==0 && nums[i]==0){
              dq.offerLast(i);
              boolean flag=true;
              if(dq.isEmpty()) flag=false;
              int num=(flag)?dq.pollFirst():j;
              int remLen=num-j+1;
              curr-=remLen;
              j=(flag)?num+1:j+1;
            }
            curr++;
            max=Math.max(max,curr);
        }
        return max;
    }
}