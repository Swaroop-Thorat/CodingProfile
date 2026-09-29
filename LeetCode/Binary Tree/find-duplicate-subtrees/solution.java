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
    Map<List<Integer>,Integer> map=new HashMap<>();
    List<TreeNode> ans=new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }
    void dfs(TreeNode root){
        if(root==null) return;

        dfs(root.left);
        dfs(root.right);
        
        List<Integer> curr=new ArrayList<>();
        isIdentical(root,curr);

        if(map.containsKey(curr) && map.get(curr)==1){
            ans.add(root);
        }

        map.put(new ArrayList<>(curr),map.getOrDefault(curr,0)+1);
    }
    void isIdentical(TreeNode root,List<Integer> curr){

        if(root!=null) isIdentical(root.left,curr);
        if(root!=null) isIdentical(root.right,curr);
        if(root==null){
            curr.add(null);
        }
        else{
            curr.add(root.val);
        }
    }
}