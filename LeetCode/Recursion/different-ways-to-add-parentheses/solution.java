class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                //left ch sagla recursively solve karu store kela
                List<Integer> l=diffWaysToCompute(exp.substring(0,i));
                //right ch sagla recursively solve karu store kela
                List<Integer> r=diffWaysToCompute(exp.substring(i+1));

                for(int ele1:l){
                    for(int ele2:r){
                        int res;
                        if(ch=='+'){
                            res=ele1+ele2;
                        }
                        else if(ch=='-'){
                            res=ele1-ele2;
                        }
                        else{
                            res=ele1*ele2;
                        }
                        ans.add(res);
                    }
                }
            }
        }
        if(ans.isEmpty()) ans.add(Integer.parseInt(exp));
        return ans;
    }
}