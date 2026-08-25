class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] arr=new Integer[m][n];
        return rec(m,n,0,0,arr);
    }
    int rec(int m ,int n,int i,int j,Integer[][] arr){
        if(i==m-1 || j==n-1) return 1;
        if(arr[i][j]!=null){
            return arr[i][j];
        }

        return arr[i][j]=rec(m,n,i+1,j,arr)+rec(m,n,i,j+1,arr);
    }
}