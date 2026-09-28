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
    public void flatten(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        change(root,null,list,0);
    }
    void dfs(TreeNode root,List<Integer> list){
        if(root==null) return;

        list.add(root.val);

        dfs(root.left,list);
        dfs(root.right,list);
    }

    void change(TreeNode root,TreeNode curr,List<Integer> list,int idx){
        if(idx>=list.size()) return;

        
        if(idx==0){
            root.val=list.get(idx);
            root.left=null;
            curr=root;
        }
        else{
            TreeNode node=new TreeNode(list.get(idx));
            node.left=null;
            curr.right=node;
            curr=node;
        }
        change(root,curr,list,idx+1);
    }
}