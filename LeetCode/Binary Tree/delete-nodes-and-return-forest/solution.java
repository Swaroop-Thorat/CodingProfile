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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set=new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }

        List<TreeNode> list=new ArrayList<>();
        dfs(root,set,list);
        if(!set.contains(root.val)) list.add(root);
        return list;
    }
    TreeNode dfs(TreeNode root,Set<Integer> set,List<TreeNode> list){
        if(root==null) return null;

        TreeNode left=dfs(root.left,set,list);
        TreeNode right=dfs(root.right,set,list);

        if(set.contains(root.val)){
            if(left!=null){
                list.add(left);
            }
            
            if(right!=null){
                list.add(right);
            }
            return null;
        }

        root.left=left;
        root.right=right;
        return root;
    }
}