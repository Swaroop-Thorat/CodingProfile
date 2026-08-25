class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int start=Integer.MAX_VALUE;
        for(int i:nums){
            set.add(i);
        }

        for(int i=k;i<=100000;i+=k){
            if(!set.contains(i)) return i;
        }
    return k;
    }
}