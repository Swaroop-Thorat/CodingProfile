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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            list.clear();
            for(int i=0;i<size;i++){
               TreeNode temp=q.poll();
               list.add(temp);
               if(temp.left!=null) q.offer(temp.left);
               if(temp.right!=null) q.offer(temp.right);
            }
        }
        TreeNode P=list.get(0);
        TreeNode Q=list.get(list.size()-1);
        return dfs(root,P,Q);
    }
    TreeNode dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;
        if(root==p || root==q) return root;

        TreeNode left=dfs(root.left,p,q);
        TreeNode right=dfs(root.right,p,q);

        if(left!=null && right!=null) return root; 
         
        return (left==null)?right:left;
    }
}