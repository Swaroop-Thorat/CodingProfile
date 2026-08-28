class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        sortIt(arr,l,mid,r);
    }
    void sortIt(int[] arr,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<mid+1 && j<high+1){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<mid+1){
            temp.add(arr[i]);
            i++;
        }
        
        while(j<high+1){
            temp.add(arr[j]);
            j++;
        }
        int idx=0;
        for(int k=low;k<=high;k++){
            arr[k]=temp.get(idx++);
        }
    }
}