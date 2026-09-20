class Solution {
    public int reverseDegree(String s) {
        int[] arr=new int[26];
        int num=26;
        for(int i=0;i<26;i++){
            arr[i]=(num--);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
          sum+=(arr[s.charAt(i) - 'a']*(i+1));
        }
        return sum;
    }
}