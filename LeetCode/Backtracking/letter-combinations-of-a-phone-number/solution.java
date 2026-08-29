class Solution {
    List<String> ans=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       backtracking(digits,0);
       return ans;
    }
    void backtracking(String digits,int idx){
        if(idx==digits.length()){
            if(sb.length()==digits.length()){
                String str=sb.toString();
                ans.add(str);
            }
            return;
        }

        int num=digits.charAt(idx)-'0';
        for(int i=0;i<letters[num].length();i++){
            sb.append(letters[num].charAt(i));
            backtracking(digits,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}