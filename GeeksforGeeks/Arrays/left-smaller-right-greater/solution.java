class Solution {
    public int findElement(int[] arr) {
        // code here
        int n=arr.length;
        int[] suff=new int[n];
        suff[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(suff[i+1],arr[i]);
        }
        int pre=arr[0];
        for(int i=1;i<n-1;i++){
            pre=Math.max(pre,arr[i]);
            if(pre<=arr[i] && suff[i]>=arr[i]) return arr[i];
        }
        return -1;
    }
}