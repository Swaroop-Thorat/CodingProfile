class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=((arr[i]%k)+k)%k;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        for(int i=0;i<arr.length;i++){
            int rem=((arr[i]%k)+k)%k;
            if(rem==0){
                if(map.get(rem)%2!=0) return false;
                continue;
            }
            if(map.containsKey(k-rem)){
                int val=map.get(k-rem);
                if(val==1){
                    map.remove(k-rem);
                }
                else{
                    map.put(k-rem,val-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}