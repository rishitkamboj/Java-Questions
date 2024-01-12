package treespackage;

import Trees.AVLtrees;
import Trees.BST;

public class populatingnextRight {
    public static void main(String[] args) {

    }
    public BST.Node connect(BST.Node root ){
        if(root==null){
            return null;
        }
        Node leftMost=root;
        while(leftMost.next!=null){
            Node current=leftMost;
            while(current!=null){
                current.left.next=current.right;
                if(current.next!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            leftMost=leftMost.left;
        }
return root;
    }
}
