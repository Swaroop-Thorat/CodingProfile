class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        rec(n,0,"",result);
        return result;
    }
    void rec(int n,int idx,String str,List<String> result){
        if(idx==n){
            result.add(str);
            return;
        }

        String s2=str+'1';
        rec(n,idx+1,s2,result);
        String s1=str+'0';
        if(idx==0 || str.charAt(str.length()-1)=='1') rec(n,idx+1,s1,result);
    }
}