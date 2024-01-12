package Trees;

public class AVLtrees {

    public class Node {
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

    public AVLtrees() {
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
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
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left-heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // left-left case
            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // right-heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }
            // right-right  case
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }


        return node;
    }


    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return p;
    }


    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print("\t " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print("\t " + node.value);
        inOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }


    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print("\t " + node.value);
    }

    public void postOrder() {
        postOrder(root);
    }


    public boolean Balanced() {
        return Balanced(root);
    }

    private boolean Balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && Balanced(node.left) && Balanced(node.right);
    }


}
