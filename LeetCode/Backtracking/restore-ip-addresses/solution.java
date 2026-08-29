class Solution {
    List<String> ans=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> restoreIpAddresses(String s) {
        if(s.length()<4 || s.length()>12) return ans;
        backtracking(s,0,0);
        return ans;
    }
    void backtracking(String s,int idx,int part){
        if(part==4 && idx==s.length()){
            sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString());
            return;
        }

        if(part>=4 || idx>=s.length()) return;


        StringBuilder curr=new StringBuilder();
        int end=Math.min(idx+3,s.length());
        for(int i=idx;i<end;i++){
            curr.append(s.charAt(i));
            if(isValid(curr.toString())){
                int prevLen=sb.length();
                sb.append(curr);
                sb.append(".");
                backtracking(s,i+1,part+1);
                sb.delete(prevLen,sb.length());
            }
        }
    }
    boolean isValid(String s){
        if(s.length()>1 && s.charAt(0)=='0') return false;
        int num=Integer.parseInt(s);

        return num<=255;
    }
}