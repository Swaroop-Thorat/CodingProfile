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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.left!=null) parent.put(node.left,node);
            if(node.right!=null) parent.put(node.right,node);
            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
        }

        Set<Integer> vis=new HashSet<>();
        vis.add(target.val);
        Queue<TreeNode> nxt=new ArrayDeque<>();
        nxt.offer(target);

        while(k>0){
            int size=nxt.size();
            for(int i=0;i<size;i++){
                TreeNode node=nxt.poll();
                TreeNode par=parent.get(node);
                TreeNode left=node.left;
                TreeNode right=node.right;

                if(par!=null && !vis.contains(par.val)){
                    nxt.offer(par);
                    vis.add(par.val);
                }
        
                if(left!=null && !vis.contains(left.val)){
                    nxt.offer(left);
                    vis.add(left.val);
                }
                if(right!=null && !vis.contains(right.val)){
                    nxt.offer(right);
                    vis.add(right.val);
                }
            }
            k--;
        }

        List<Integer> ans=new ArrayList<>();

        while(!nxt.isEmpty()){
            ans.add(nxt.poll().val);
        }
        return ans;
    }
}