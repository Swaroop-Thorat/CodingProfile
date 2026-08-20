class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=Math.abs(n);
            x=1/x;
        }

        return power(x,n);
    }
    double power(double x,int n){
        if(n==0) return 1.0;
        
        double pow=power(x,n/2);
        double res=pow*pow;
        if(n%2!=0) res*=x;

        return res;
    }
}