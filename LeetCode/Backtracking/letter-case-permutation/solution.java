class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        f(s,0,new StringBuilder());
        return ans;
    }
    void f(String s,int idx,StringBuilder sb){
        if(idx==s.length()){
            ans.add(sb.toString());
            return;
        }
        if(Character.isDigit(s.charAt(idx))){
            sb.append(s.charAt(idx));
            f(s,idx+1,sb);
            sb.deleteCharAt(sb.length()-1);
            return;
        }

        sb.append(Character.toLowerCase(s.charAt(idx)));
        f(s,idx+1,sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(Character.toUpperCase(s.charAt(idx)));
        f(s,idx+1,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}