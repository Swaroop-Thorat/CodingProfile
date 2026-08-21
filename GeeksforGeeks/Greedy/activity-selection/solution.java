class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        ArrayList<ArrayList<Integer>> pairs=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(start[i]);
            pair.add(finish[i]);
            pairs.add(pair);
        }
        
        Collections.sort(pairs,(a,b)->{
            if(a.get(1)==b.get(1)){
                return Integer.compare(a.get(0),b.get(0));
            }
            return Integer.compare(a.get(1),b.get(1));
        });
        
        int count=1;
        int Start=pairs.get(0).get(0);
        int end=pairs.get(0).get(1);
        for(int i=1;i<pairs.size();i++){
            int s=pairs.get(i).get(0);
            int e=pairs.get(i).get(1);
            
            if(s<=end){
                continue;
            }
            else{
                Start=s;
                end=e;
                count++;
            }
        }
        return count; 
    }
}