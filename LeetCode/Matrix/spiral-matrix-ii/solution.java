class Solution {
    public int[][] generateMatrix(int n) {
        int lim=n*n,i=1,r=0,c=0,N=n;
        int[][] arr=new int[n][n];
        while(i<=lim-1){
            while(c<n-1){
               arr[r][c]=i;
               i++;
               c++;
            }
            while(r<n-1){
               arr[r][c]=i;
               i++;
               r++;
            }
            while(c>(N-n)){
               arr[r][c]=i;
               i++;
               c--;
            }
            n--;
            while(r>(N-n)){
               arr[r][c]=i;
               i++;
               r--;
            }
        }
        arr[r][c]=i;
        return arr;
    }
}