class Solution {
    public int minSwaps(int[] Nums) {
        Integer[] nums=new Integer[Nums.length];
        HashMap<Integer,Integer> idx=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            nums[i]=Nums[i];
            idx.put(nums[i],i);
        }

        Arrays.sort(nums,(a,b)->{
            int n1=calcSum(a);
            int n2=calcSum(b);

            if(n1==n2){
                return Integer.compare(a,b);
            }
            return Integer.compare(n1,n2);
        });

        int swaps=0;

        boolean[] vis=new boolean[nums.length];

        int[] tar=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            tar[idx.get(nums[i])]=i;
        }

        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                swaps+=(dfs(i,vis,tar)-1);
            }
        }
        return swaps;
    }
    int calcSum(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    int dfs(int i,boolean[] vis,int[] tar){
        if(vis[i]) return 0;
        vis[i]=true;

        return dfs(tar[i],vis,tar)+1;
    }
}