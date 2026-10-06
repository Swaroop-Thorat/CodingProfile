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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int left=leftDepth(root);
        int right=rightDepth(root);

        if(left==right) return (int) Math.pow(2,left)-1;

        return countNodes(root.left)+countNodes(root.right)+1; 
    }
    int rightDepth(TreeNode root){
        int d=0;
        while(root!=null){
            d++;
            root=root.right;
        }

        return d;
    }

    int leftDepth(TreeNode root){
        int d=0;
        while(root!=null){
            d++;
            root=root.left;
        }

        return d;
    }
}