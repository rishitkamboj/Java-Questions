package Trees;

import java.util.Scanner;

public class BinaryTree {
     private Node root;

    public BinaryTree() {
    }



    private Node insert(Node node){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value or enter -1 to exit: ");
        int value=sc.nextInt();
        if(value==-1){
            return null;
        }
        node=new Node(value);
        System.out.print("Enter the left node of "+node.value+": ");
        node.left=insert(node.left);
        System.out.print("Enter the right node of "+node.value+": ");
        node.right=insert(node.right);
        return node;
    }

    public void insert(){
        root=insert(root);
    }




    private void inOrder(Node node){
        if(node!=null){
            System.out.printf("\t%d",node.value);
            inOrder(node.left);
            inOrder(node.right);
        }
    }
    public void inOrder(){
        inOrder(root);
    }

















    private class Node{
        int value;
        Node left;
        Node right;


        public Node(int value) {
            this.value=value;
        }
    }

}
