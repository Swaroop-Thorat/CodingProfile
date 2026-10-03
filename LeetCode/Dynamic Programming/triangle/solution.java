class Solution {
    Integer[][] memo;
    public int minimumTotal(List<List<Integer>> triangle) {
        memo=new Integer[triangle.size()+1][triangle.size()+1];
        return f(triangle,0,0);
    }
    int f(List<List<Integer>> tri,int i,int level){
        if(level==tri.size()) return 0;

        if(memo[i][level]!=null) return memo[i][level];

        int res=Math.min(f(tri,i,level+1),f(tri,i+1,level+1));

        return memo[i][level]=res+tri.get(level).get(i);
    }
}