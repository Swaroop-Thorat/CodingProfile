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
    int[] count={0};
    public int minCameraCover(TreeNode root) {
        int rootVal=dfs(root);
        if(rootVal==0) count[0]++;
        return count[0];
    }
    int dfs(TreeNode root){
     if(root==null) return 2;
     
     int left=dfs(root.left);
     int right=dfs(root.right);
     
     if(left==0 || right==0){
        count[0]++;
        return 1;
     }
     else if(left==2 && right==2){
        return 0;
     }

     return 2;
    }
}
    /*
    STATE 0: mala camera pahije
    STATE 1: mazyakade camera ahe
    STATE 2: mazyakade nai pn mala garaj pn nai
    */