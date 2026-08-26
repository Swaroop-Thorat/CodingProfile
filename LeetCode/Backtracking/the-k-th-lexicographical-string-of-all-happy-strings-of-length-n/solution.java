class Solution {
    List<String> list=new ArrayList<>();
    public String getHappyString(int n, int k) {
        rec("",n);
        if(list.size()<k) return "";
        return list.get(k-1);
    }
    void rec(String str,int n){
        if(str.length()==n){
            list.add(str);
            return;
        }

        for(char ch:new char[]{'a','b','c'}){
            if(str.length()>0 && str.charAt(str.length()-1)==ch) continue;
            rec(str+ch,n);
        }
    }
}