//package treespackage;
//
//class Node2 {
//    int data;
//    Node2 left, right;
//    Node2(int data)
//    {
//        this.data=data;
//        left=null;
//        right=null;
//    }
//}
//
// class Solution {
//    static Node2 prev = null;
//    static void flatten(Node2 root) {
//        if (root == null) return;
//
//        flatten(root . right);
//        flatten(root . left);
//
//        root . right = prev;
//        root . left = null;
//        prev = root;
//    }}
//
//
//    public class flatten{
//    public static void main(String args[]) {
//
//        Node2 root = new Node2(1);
//        root . left = new Node2(2);
//        root . left . left = new Node2(3);
//        root . left . right = new Node2(4);
//        root . right = new Node2(5);
//        root . right . right = new Node2(6);
//        root . right . right . left = new Node2(7);
//        flatten(root);
//        while(root.right!=null)
//        {
//            System.out.print(root.data+"->");
//            root=root.right;
//        }
//        System.out.print(root.data);
//    }
//}