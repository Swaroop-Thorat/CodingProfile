class Solution {
    Integer[][] memo;
    public int minDistance(String word1, String word2) {
        memo=new Integer[word1.length()+1][word2.length()+1];
        return f(word1,word2,0,0);
    }
    int f(String s1,String s2,int i, int j){

 

        if(i==s1.length()){
            return s2.length()-j;
        }

        if(j==s2.length()){
            return s1.length()-i;
        }

        if(memo[i][j]!=null) return memo[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return memo[i][j]=f(s1,s2,i+1,j+1);
        }
        else{
            int d=f(s1,s2,i+1,j);

            int in=f(s1,s2,i,j+1);

            int r=f(s1,s2,i+1,j+1);

            return memo[i][j]=Math.min(Math.min(d,in),r)+1;
        }
    }
}