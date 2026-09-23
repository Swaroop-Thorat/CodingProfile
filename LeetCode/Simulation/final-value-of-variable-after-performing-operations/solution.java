class Solution {
    public int finalValueAfterOperations(String[] oper) {
        int res=0;
        for(int i=0;i<oper.length;i++){
            if(oper[i].equals("--X") || oper[i].equals("X--")){
                res--;
            }
            else{
                res++;
            }
        }
        return res;
    }
}