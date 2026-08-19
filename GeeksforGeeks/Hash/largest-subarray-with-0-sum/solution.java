class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,sum=0;
         map.put(0,-1);
        for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         
         if(map.containsKey(sum)){
                 max=Math.max(max,i-map.get(sum));
         }
         else{
             map.put(sum,i);
         }
            
        }
        return max;
    }
}