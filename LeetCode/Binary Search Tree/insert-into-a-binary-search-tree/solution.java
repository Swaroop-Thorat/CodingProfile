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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(5);
        dfs(root,val);
        return root;
    }
    void dfs(TreeNode root,int val){
        if(root!=null){
            TreeNode node=new TreeNode(val);
            if(root.left==null && root.val>val){
                root.left=node;
                return;
            }
            else if(root.right==null && root.val<val){
                root.right=node;
                return;
            }
        }

        if(root.val>val){
            dfs(root.left,val);
        }
        else if(root.val<val){
            dfs(root.right,val);
        }
    }
}