/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int ceilVal=-1;
        while(root!=null){
            if(root.data<x){
                root=root.right;
            }
            else if(root.data>x){
                ceilVal=root.data;
                root=root.left;
            }
            else{
                return root.data;
            }
        }
        return ceilVal;
    }
}