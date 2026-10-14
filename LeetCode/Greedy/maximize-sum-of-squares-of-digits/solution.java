class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<num;i++){
            if(sum>=9){
                res.append("9");
                sum-=9;
            }
            else{
                res.append(sum);
                if(sum!=0) sum=0;
            }
        }
        if(sum>0) res.setLength(0);
        String ans=res.toString();
        return ans;
    }
}