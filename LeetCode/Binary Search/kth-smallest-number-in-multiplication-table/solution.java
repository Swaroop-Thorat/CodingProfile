class Solution {
    public int findKthNumber(int m, int n, int k) {
        int high=m*n,low=1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(!isEnough(mid,m,n,k)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    boolean isEnough(int mid,int row,int col,int k){
        int count=0;
        for(int i=1;i<=row;i++){
            count+=Math.min(mid/i,col);
        }
        return count>=k;
    }
}