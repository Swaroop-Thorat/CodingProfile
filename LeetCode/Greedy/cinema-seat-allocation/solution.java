class Solution {
    public int maxNumberOfFamilies(int n, int[][] res) {
        long ans=n*2;
        Arrays.sort(res,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });

        for(int i=0;i<res.length;i++){
            boolean first=false;
            boolean second=false;
            int num=res[i][0];
            int l=-1,f=-1;
            while(i<res.length && res[i][0]==num){
                if(res[i][1]>=2 && res[i][1]<=5){
                    first=true;
                    l=res[i][1];
                }

                if(res[i][1]>=6 && res[i][1]<=9){
                    second=true;
                    if(f==-1){
                        f=res[i][1];
                    }
                }

                i++;
            }
            if(first) ans-=1;
            if(second) ans-=1;
            if(first && second && f>=8 && l<=3) ans+=1;
            i--;
        }

        return (int) ans;
    }
}