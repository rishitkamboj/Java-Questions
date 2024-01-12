package Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {
    }

    private static class Node{
       int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;




//     insert elements
 public void Insert(Scanner sc){
     System.out.println("Enter the root Node: ");
     int value=sc.nextInt();
     root=new Node(value);
     Insert(sc,root);

 }
 private void Insert(Scanner sc, Node node){
     System.out.println("Do you want to enter left of "+node.value);
     boolean left=sc.nextBoolean();
     if(left){
         System.out.println("Enter the value of the left of "+node.value+" : ");
         int value=sc.nextInt();
         node.left=new Node(value);
         Insert(sc,node.left);
     }
     System.out.println("Do you want to enter right of "+node.value);
     boolean right=sc.nextBoolean();
     if(right){
         System.out.println("Enter the value of the left of :");
         int value=sc.nextInt();
         node.right=new Node(value);
         Insert(sc,node.right);
     }
 }

//    private Node insert(Node root){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value or enter -1 to exit: ");
//        int n=sc.nextInt();
//        if(n==-1){
//            return null;
//        }
//        System.out.println("Enter the left child of "+n+" :");
//        insert(root.left);
//        System.out.println("Enter the right child of "+n+" :");
//        insert(root.right);
//
//        return root;
//    }
//    public void insert(){
//        root=insert(root);
//    }



//    private void preOrder(Node node){
//         if(node!=null){
//             System.out.print(node.value+" ");
//             preOrder(node.left);
//             preOrder(node.right);
//         }
//    }
//    public void preOrder(){
//         preOrder(root);
//    }



    public void display(){
     display(root,"");
    }
    private void display(Node node,String indent){
     if(node==null){
         return;
     }
        System.out.println(indent+node.value);
     display(node.left,indent+"\t");
     display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
    prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {

     if(node==null){
         return;
     }
     prettyDisplay(node.right,level+1);
          if(level!=0){
              for (int i = 0; i <level-1 ; i++) {
                  System.out.print("|\t\t");
              }
              System.out.println("|----->"+node.value);
          }
          else{
              System.out.println(node.value);
          }
          prettyDisplay(node.left,level+1);
    }


    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Scanner sc=new Scanner(System.in);
        tree.Insert(sc);
        tree.prettyDisplay();
    }



}
