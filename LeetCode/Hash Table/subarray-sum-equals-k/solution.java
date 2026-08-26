class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> map=new TreeMap<>();
        int count=0,sum=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int complement=sum-k;
            if(map.containsKey(complement)){
                count+=map.get(complement);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}