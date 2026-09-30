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
    public TreeNode deleteNode(TreeNode root, int key) {
        return dfs(root,key);
    }
    TreeNode dfs(TreeNode root,int key){
        if(root==null) return null;

        TreeNode left=dfs(root.left,key);
        TreeNode right=dfs(root.right,key);
        
        if(root.val==key){
            if(right==null){
                return left;
            }
            else{
                joinIt(right,left);
                return right;
            }
        }

        root.left=left;
        root.right=right;

        return root;
    }
    void joinIt(TreeNode root,TreeNode node){
        if(root.left==null){
            root.left=node;
            return;
        }
        
        joinIt(root.left,node);
    }
}