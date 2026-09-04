/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int idx=0;
    public Node preToBST(int pre[]) {
        // code here
        return dfs(pre,Integer.MAX_VALUE);
    }
    Node dfs(int[] pre,int prev){
        if(idx>=pre.length || pre[idx]>prev){
            return null;
        }
        Node newNode=new Node(pre[idx]);
        idx++;
        
        newNode.left=dfs(pre,newNode.data);
        newNode.right=dfs(pre,prev);
        
        return newNode;
    }
}