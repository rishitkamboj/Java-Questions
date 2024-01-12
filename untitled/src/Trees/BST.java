package Trees;



public class BST {
    private Node root;

    public BST() {
    }



    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value>node.value){
            node.left=insert(node.left,value);
        }
        else{
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }


    public void insert(int value){
        root=insert(root,value);
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

private int height(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
}









    private class Node{
        int value;
        Node left;
       Node right;
       int height;


        public Node(int value) {
            this.value=value;
        }
    }

}
