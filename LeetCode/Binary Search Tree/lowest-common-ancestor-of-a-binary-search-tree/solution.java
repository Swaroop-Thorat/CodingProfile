/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;

        TreeNode left=null;
        TreeNode right=null;
        if(p.val<root.val && q.val<root.val){
            left=lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>root.val && q.val>root.val){
            right=lowestCommonAncestor(root.right,p,q);
        }
        else{
            return root;
        }
         
        if(left==null && right==null) return null;

        return (left==null)?right:left;
    }
}