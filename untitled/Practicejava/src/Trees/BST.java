package Trees;

public class BST {

     public class Node{
         private int value;
         private int height;
         private Node left;
         private Node right;

         public Node(int value) {
             this.value = value;
         }

         public int getValue() {
             return value;
         }
     }
     private Node root;

     public BST(){}

    public int height(Node node){
         if(node==null){
             return -1;
         }
         return node.height;
    }
    public boolean isEmpty(){
         return root==null;
    }

    public void insert(int value){
         root=insert(root,value);
    }

    private Node insert(Node node,int value){
         if(node ==null){
                node=new Node(value);
           return node;
         }
         if(value<node.value){
             node.left=insert(node.left,value);
         }
         if(value>node.value){
             node.right=insert(node.right,value);
         }

         node.height=Math.max(height(node.left),height(node.right))+1;
         return node;
    }

    private void preOrder(Node node){
         if(node==null){
             return;
         }
        System.out.print("\t "+node.value);
         preOrder(node.left);
         preOrder(node.right);
    }
    public void preOrder(){
         preOrder(root);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print("\t "+node.value);
        inOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }


    private void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print("\t "+node.value);
    }
    public void postOrder(){
        postOrder(root);
    }




    public boolean Balanced(){
         return Balanced(root);
    }
    private boolean Balanced(Node node){
         if(node==null){
             return true;
         }
         return Math.abs(height(node.left)-height(node.right))<=1 && Balanced(node.left) && Balanced(node.right);
    }














}
