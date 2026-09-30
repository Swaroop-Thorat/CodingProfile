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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        TreeNode left=null,right=null;

        if(root.val<val){
          right=searchBST(root.right,val);
        }
        else if(root.val>val){
          left=searchBST(root.left,val);
        }
        else{
            return root;
        }
        
        if(left==null && right==null) return null;
        return (left==null)?right:left;
    }
}