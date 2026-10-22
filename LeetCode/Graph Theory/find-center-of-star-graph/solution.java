class Solution {
    public int findCenter(int[][] edges) {
        int[] in=new int[edges.length+2];

        for(int[] e:edges){
            in[e[1]]++;
            in[e[0]]++;
        }

        for(int i=1;i<=edges.length+1;i++){
            if(in[i]>1) return i;
        }
        return 0;
    }
}