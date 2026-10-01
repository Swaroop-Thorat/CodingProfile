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
    public void recoverTree(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        dfs(root,list);
        TreeNode[] swaps=new TreeNode[2];
        for(int i=1;i<list.size();i++){
           if(list.get(i).val<list.get(i-1).val){
            if(swaps[0]==null) swaps[0]=list.get(i-1);
            swaps[1]=list.get(i);
           }
        }

        int temp=swaps[0].val;
        swaps[0].val=swaps[1].val;
        swaps[1].val=temp;
    }
    void dfs(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);
    }
}