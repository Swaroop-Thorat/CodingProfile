/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long max=Long.MIN_VALUE;
    long MOD=(long)(1e9)+7;
    public int maxProduct(TreeNode root) {
        int total=findTotalSum(root);
        dfs(root,total);
        return (int) (max%MOD);
    }
    int dfs(TreeNode root,int total){
        if(root==null) return 0;

        int left=dfs(root.left,total);
        int right=dfs(root.right,total);

        long sum=left+right+root.val;

        long rem=total-sum;

        max=Math.max(sum*rem,max);

        return (int) sum;
    }
    int findTotalSum(TreeNode root){
        if(root==null) return 0;
        int left=findTotalSum(root.left);
        int right=findTotalSum(root.right);

        return left+right+root.val;
    }
}