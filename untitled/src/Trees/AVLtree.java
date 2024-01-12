package Trees;

public class AVLtree {
    private Node root;

    public AVLtree() {
    }


    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }


    private Node rotate(Node node) {

        if (height(node.left) - height(node.right) > 1) {
            // left-left case
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // left-right case
            if (height(node.left.right) - height(node.left.left) > 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.right) - height(node.left) > 1) {
            // right-right case
            if (height(node.right.right) - height(node.right.left) > 0) {
                return leftRotate(node);
            }
            // right-left case
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

        }

        return node;
    }

    private Node leftRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return c;
    }


    private Node rightRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return p;
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
            this.value = value;
        }
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



}
