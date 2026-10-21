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
    class pair{
        int level;
        TreeNode node;
        pair(TreeNode node,int level){
            this.level=level;
            this.node=node;
        }
    }
    public boolean isEvenOddTree(TreeNode root) {
       Queue<pair> q=new ArrayDeque<>();
       q.offer(new pair(root,0));

       while(!q.isEmpty()){
        int s=q.size();
        int prev=-1;
        for(int i=0;i<s;i++){
            pair p=q.poll();
            TreeNode n=p.node;
            
            if(p.level%2==0){
                if(n.val%2==0) return false;
                if (prev!=-1 && n.val<=prev) return false;
            }
            else{
                if(n.val%2!=0) return false;
                if (prev!=-1 && n.val>=prev) return false;
            }

            prev=n.val;

            if(n.left!=null) q.offer(new pair(n.left,p.level+1));
            if(n.right!=null) q.offer(new pair(n.right,p.level+1));
        }
       }
       return true;
    }
}