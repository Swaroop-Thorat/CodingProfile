class Solution {
    class DSU{
        int[] parent;
        int[] size;

        DSU(){
            parent=new int[26];
            size=new int[26];

            for(int i=0;i<26;i++){
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
                size[rootB]+=size[rootA];
                parent[rootA]=rootB;
            }
            else{
                size[rootA]+=size[rootB];
                parent[rootB]=rootA;
            }
        }
    }
    public boolean equationsPossible(String[] equations) {
        DSU uf=new DSU();

        for(String st:equations){
            char a=st.charAt(0);
            char b=st.charAt(3);
            if(st.charAt(1)!='!'){
                uf.union(a-'a',b-'a');
            }
        }
        for(String st:equations){
            char a=st.charAt(0);
            char b=st.charAt(3);
            if(st.charAt(1)=='!'){
                if(uf.find(a-'a')==uf.find(b-'a')) return false;
            }
        }

        return true;
    }
}