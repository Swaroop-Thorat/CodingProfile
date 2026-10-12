class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        if(n<2 || s<2) return new ArrayList<>();

        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
               for(int j=i*i;j<=n;j+=i){
                isPrime[j]=false;
               }
            }
        }

        int sum=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(isPrime[i]){
               if(sum+i<=s){
                res.add(i);
                sum+=i;
               }
            }
        }

        return res;
    }
}