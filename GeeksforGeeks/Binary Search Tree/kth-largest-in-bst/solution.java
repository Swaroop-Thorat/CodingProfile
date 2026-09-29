/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    static int ans=-1;
    public int kthLargest(Node root, int k) {
        // code here
        dfs(root,k,new int[]{0});
        return ans;
        }
    static void dfs(Node root,int k,int[] curr){
        if(root==null) return;
        dfs(root.right,k,curr);
        curr[0]++;
        if(k==curr[0]) {
            ans=root.data;
            return;
        }
        dfs(root.left,k,curr);
    }
}