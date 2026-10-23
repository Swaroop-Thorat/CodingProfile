class Solution {
     class DSU{
            int[] parent;
            int[] size;

            DSU(int n){
                parent=new int[n];
                size=new int[n];

                for(int i=0;i<n;i++){
                    size[i]=1;
                    parent[i]=i;
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
    public int makeConnected(int n, int[][] connections) {
       Set<Integer> set=new HashSet<>();

       DSU uf=new DSU(n);

       for(int[] e:connections){
        uf.union(e[0],e[1]);
       }

       for(int i=0;i<n;i++){
        set.add(uf.find(i));
       }

       int cc=set.size();
       int edges=connections.length;

       if(edges<n-1) return -1;

       return cc-1;
    }
}