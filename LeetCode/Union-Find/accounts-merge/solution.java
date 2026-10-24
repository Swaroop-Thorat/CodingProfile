class Solution {
    class DSU{
        int[] parent;
        int[] size;

        DSU(int n){
            parent=new int[n];
            size=new int[n];

            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }

        int find(int i){
            if(parent[i]==i) return i;

            return parent[i]=find(parent[i]);
        }

        void union(int A,int B){
            int rA=find(A);
            int rB=find(B);

            if(rA==rB) return;

            if(size[rA]<size[rB]){
                size[rB]+=size[rA];
                parent[rA]=rB;
            }
            else{
                size[rA]+=size[rB];
                parent[rB]=rA;
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,Integer> acc=new HashMap<>();
        int n=accounts.size();

        DSU uf=new DSU(n);

        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(acc.containsKey(accounts.get(i).get(j))){
                    uf.union(i,acc.get(accounts.get(i).get(j)));
                }
                acc.put(accounts.get(i).get(j),i);
            }
        }

        HashMap<Integer,Set<String>> merge=new HashMap<>();

        for(int i=0;i<n;i++){
            Set<String> set=new TreeSet<>();
            int key=uf.find(i);
            set=merge.getOrDefault(key,new TreeSet<>());
            for(int j=1;j<accounts.get(i).size();j++){
                set.add(accounts.get(i).get(j));
            }
            merge.put(key,set);
        }

        List<List<String>> ans=new ArrayList<>();

        for(Map.Entry<Integer,Set<String>> a:merge.entrySet()){
            int key=a.getKey();
            List<String> list=new ArrayList<>();
            list.add(accounts.get(key).get(0));
            for(String st:a.getValue()){
                list.add(st);
            }
            ans.add(new ArrayList<>(list));
        } 

        return ans;
    }
}