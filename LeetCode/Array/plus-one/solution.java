class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] arr;
      if(digits[n-1]==9){
        arr=new int[n+1];
        int temp=1;
        int i;
        for(i=n-1;i>=0;i--){
            int res=digits[i]+temp;
            if(res>9){
                arr[i+1]=res%10;
                temp=res/10;
            }else{
                arr[i+1]=res;
                temp=0;
            }
        }
        arr[i+1]=temp;
      }else{
        arr=new int[n];
        arr[n-1]=digits[n-1]+1;
        for(int i=0;i<n-1;i++){
            arr[i]=digits[i];
        }
     }
     if(arr[0]==0){
        int[] res=new int[arr.length-1];
        for(int i=0;i<res.length;i++){
            res[i]=arr[i+1];
        }
        return res;
     }
     return arr;
    }
}