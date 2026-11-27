class Solution {
    Integer[][][] memo;
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        memo=new Integer[n][budget+1][2];
        int[] hasFactor=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) continue;
                if(items[j][0]%items[i][0]==0){
                    hasFactor[i]++;
                }
            }
        }
        return rec(items,budget,hasFactor,0,0);
    }
    int rec(int[][] items,int bud,int[] has,int i,int flag){
        if(bud==0 || i==items.length){
            return 0;
        }
        if(memo[i][bud][flag]!=null) return memo[i][bud][flag];

        int noPick=rec(items,bud,has,i+1,0);
        int pick=0;
        if(bud>=items[i][1]){
            if(flag==0) pick+=has[i]; 
            pick+=rec(items,bud-items[i][1],has,i,1)+1;
        }
        return memo[i][bud][flag]=Math.max(pick,noPick);
    }
}