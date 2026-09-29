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
    int ans=0;
    public int longestZigZag(TreeNode root) {
        dfs(root,0,0,0);
        return ans;
    }
    void dfs(TreeNode root,int state,int left,int right){
        if(root==null) return;
        
        ans=Math.max(ans,Math.max(left,right));


        if(state==-1){
            dfs(root.left,-1,1,0);
            dfs(root.right,1,0,left+1);
        }
        else if(state==1){
            dfs(root.left,-1,right+1,1);
            dfs(root.right,1,0,1);
        }
        else{
            dfs(root.left,-1,1,0);
            dfs(root.right,1,0,1);
        }
    }
}