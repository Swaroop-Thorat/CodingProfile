class Solution {
    public int equal012(String s) {
        // code here
        Map<List<Integer>,Integer> map=new HashMap<>();
        int diff1=0,diff2=0;
        int res=0;
        map.put(List.of(diff1,diff2),1);
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                diff1--;
            }
            else if(ch=='1'){
                diff1++;
                diff2--;
            }
            else{
                diff2++;
            }
            
            List<Integer> pair=List.of(diff1,diff2);
            if(map.containsKey(pair)){
                res+=map.get(pair);
            }
            
            map.put(pair,map.getOrDefault(pair,0)+1);
        }
        return res;
    }
}