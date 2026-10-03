class Solution {
    Integer[][] memo;
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        memo=new Integer[]
        backtracking(s,0,new ArrayList<>());
        return ans;
    }
    void backtracking(String s,int i,List<String> list){
        if(i>=s.length()){
          ans.add(new ArrayList<>(list));
          return;
        }

        for(int idx=i;idx<s.length();idx++){
            String curr=s.substring(i,idx+1);
            if(isPalindrome(curr)){
               list.add(curr);
               backtracking(s,idx+1,list);
               list.remove(list.size()-1);
            }
        }
    }
    boolean isPalindrome(String curr){
        int j=0,k=curr.length()-1;
        while(j<k){
            if(curr.charAt(j)!=curr.charAt(k)) return false;
            j++;
            k--;
        }
        return true;
    }
}