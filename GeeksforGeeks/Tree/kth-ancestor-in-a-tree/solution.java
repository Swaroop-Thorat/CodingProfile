/* Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public int kthAncestor(Node root, int k, int node) {
        // code here
        HashMap<Integer,Node> map=new HashMap<>();
        int res=0;
        dfs(root,map);
        map.put(root.data,null);
        while(k>0){
            Node temp=map.get(node);
            if(temp==null) return -1;
            res=temp.data;
            k--;
            node=res;
            
        }
        return res;
    }
    
    static void dfs(Node node,HashMap<Integer,Node> map){
        if(node==null) return;
        
        if(node.left!=null) map.put(node.left.data,node);
        if(node.right!=null) map.put(node.right.data,node);
        
        dfs(node.left,map);
        dfs(node.right,map);
    }
}