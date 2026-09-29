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
    int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k,new int[]{0});
        return ans;
    }
    void dfs(TreeNode root,int k,int[] curr){
        if(root==null) return;
        
        dfs(root.left,k,curr);
        curr[0]++;
        if(k==curr[0]) {
            ans=root.val;
            return;
        }
        dfs(root.right,k,curr);
    }
}