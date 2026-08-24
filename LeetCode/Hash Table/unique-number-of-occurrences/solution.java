class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>(); 
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        Set<Integer> set=new HashSet<>();
        for(int i=-1000;i<1001;i++){
            if(map.containsKey(i) && set.contains(map.get(i))) return  false;
            set.add(map.get(i));
        }
        return true;
    }
}