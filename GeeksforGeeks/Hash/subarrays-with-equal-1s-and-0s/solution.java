class Solution {
    public int countSubarray(int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int count=0,curr=0;
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            curr+=(arr[i]==1)?1:-1;
            
            if(map.containsKey(curr)){
                count+=map.get(curr);
            }
            
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        
        return count;
    }
}