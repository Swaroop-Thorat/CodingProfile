class TreeAncestor {
    int[][] up;
    public TreeAncestor(int n, int[] parent) {
        up=new int[n][20];
        for(int i=0;i<n;i++) Arrays.fill(up[i],-1);
        for(int i=0;i<n;i++){
            up[i][0]=parent[i];
        }

        for(int j=1;j<20;j++){
            for(int i=0;i<n;i++){
                int a=up[i][j-1];
                if(a!=-1){
                    up[i][j]=up[a][j-1];
                }
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
        for(int i=0;i<20;i++){
            if((k & (1<<i))!=0){
                node=up[node][i];
                if(node==-1) return -1;
            }
        }

        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */