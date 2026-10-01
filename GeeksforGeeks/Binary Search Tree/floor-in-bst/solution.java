/*
Definition for Node
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
    public int findMaxFork(Node root, int k) {
        // code here.
        int[] floorVal={-1};
        dfs(root,k,floorVal);
        return floorVal[0];
    }
    static void dfs(Node root,int k,int[] floorVal){
        if(root==null) return;
        
        if(root.data>k){
            dfs(root.left,k,floorVal);
        }
        else if(root.data<k){
            floorVal[0]=root.data;
            dfs(root.right,k,floorVal);
        }
        else{
            floorVal[0]=k;
            return;
            
        }
    }
}