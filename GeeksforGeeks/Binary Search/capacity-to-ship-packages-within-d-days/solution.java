class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        // code here
        int low=0,high=0;
        
        for (int x:arr) {
            low=Math.max(low,x);   
            high+=x;               
        }
        
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(possible(arr,mid,d)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return low;
    }
    
    static boolean possible(ArrayList<Integer> arr,int capacity,int d){
        int sum=0;
        int day=1;
        
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum>capacity){
                day++;
                sum=arr.get(i);
            }
        }
        return day<=d;
    }
}