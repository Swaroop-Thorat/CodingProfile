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
    public int rob(TreeNode root) {
        int[] options=dfs(root);
        return Math.max(options[0],options[1]);
    }
    int[] dfs(TreeNode root){
        if(root==null) return new int[]{0,0};

        int[] left=dfs(root.left);
        int[] right=dfs(root.right);

        int[] curr=new int[2];
        int robIt=left[1]+right[1]+root.val;
        int dontRob=Math.max(left[0],left[1])+Math.max(right[0],right[1]);

        curr[0]=robIt;
        curr[1]=dontRob;

        return curr;
    }
}