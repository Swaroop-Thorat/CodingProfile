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
    TreeNode ROOT;
    public TreeNode trimBST(TreeNode root, int low, int high) {
        ROOT=root;
        dfs(root,low,high,null);
        return ROOT;
    }
    void dfs(TreeNode root,int low, int high,TreeNode prev){
        if(root==null) return; 
        
        if(root.val>=low && root.val<=high){
            dfs(root.left,low,high,root);
            dfs(root.right,low,high,root);
        }
        else if(root.val<low){
           if(prev==null){
            ROOT=root.right;
           }
           else{
            prev.left=root.right;
           }
           dfs(root.right,low,high,prev);
        }
        else{
           if(prev==null){
            ROOT=root.left;
           }
           else{
            prev.right=root.left;
           }
           dfs(root.left,low,high,prev);
        }
    }
}