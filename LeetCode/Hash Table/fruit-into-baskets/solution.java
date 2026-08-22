class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int j=0,max=0;
        for(int i=0;i<fruits.length;i++){
            if(!map.containsKey(fruits[i]) && map.size()<2){
                map.put(fruits[i],i);
            }
            else if(map.containsKey(fruits[i])){
                map.put(fruits[i],i);
            }
            else{
                int[] curr=new int[2];
                int k=0;
                for(int key:map.keySet()){
                    curr[k++]=map.get(key);
                }
                j=Math.min(curr[0]+1,curr[1]+1);

                if(curr[0]<curr[1]) {
                    map.remove(fruits[curr[0]]);
                }else{
                    map.remove(fruits[curr[1]]);
                }
                
                map.put(fruits[i],i);
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}