class Solution {
    class DSU{
        int[] parent;
        int[] size;

        DSU(int n){
            parent=new int[n+1];
            size=new int[n+1];

            for(int i=1;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }

        int find(int i){
            if(parent[i]==i) return i;

            return parent[i]=find(parent[i]);
        }

        void union(int A,int B){
            int rootA=find(A);
            int rootB=find(B);

            if(rootA==rootB) return;

            if(size[rootA]<size[rootB]){
                parent[rootA]=rootB;
                size[rootB]+=size[rootA];
            }
            else{
                parent[rootB]=rootA;
                size[rootA]+=size[rootB];
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        Set<Integer> set=new HashSet<>();

        for(int[] e:edges){
            set.add(e[0]);
            set.add(e[1]);
        }

        DSU uf=new DSU(set.size());

        for(int[] e:edges){
            if(uf.find(e[0])==uf.find(e[1])){
                return e;
            }
            else{
                uf.union(e[0],e[1]);
            }
        }
        return new int[]{};
    }
}