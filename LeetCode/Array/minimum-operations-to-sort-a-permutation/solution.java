class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length, max=0, min=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                min=i;
                if(nums[(i-1+n) % n]==n-1){
                    max=(i-1+n)%n;
                }else if(nums[(i+1+n)%n]==n-1) {
                    max=(i+1+n)%n;
                } else{
                    return -1;
                }
                break;
            }
        }

        if((min+1+n)%n==max){
            int i=min+1, counter=n-1;
            while((i)%n!=(min)%n) {
                if(nums[(i)%n]!=counter){
                    return -1;
                }
                counter--;
                i++;
            }
            if(min==0 && max==n-1) {
                return 0;
            } 
            if(min==n-1 && max==0) {
                return 1;
            }
            return 1 + Math.min((max),(((n-1)-min)));
        } 
        else if((min-1+n)%n==max) {
            int i=min+1, counter=1;
            while((i)%n!=(min)%n) {
                if(nums[(i)%n]!=counter) {
                    return -1;
                }
                i++;
                counter++;
            }
            if(min==0 && max==n-1) {
                return 0;
            } 
            if(min==n-1 && max==0) {
                return 1;
            }
            return Math.min((min),(2+((n-1)-max)));
        }
        else{
            return -1;
        }
    }
}