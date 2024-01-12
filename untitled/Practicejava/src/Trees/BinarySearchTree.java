package Trees;

public class BinarySearchTree {
    public class node{
        private int value;
        private int height;
        private node left;
        private node right;


        public node(int value) {
            this.value = value;
            this.left=null;
            this.right=null;
        }

        public int getValue() {
            return value;
        }
    }


    private node root;

    public BinarySearchTree() {
    }


    public int height(node n){
        if(n==null){
            return -1;
        }
return n.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }
    private void display(node root, String details){
        if(root==null){
            return;
        }
        System.out.println(details+ root.getValue());
        display(root.left,"Left child of "+root.getValue()+": ");
        display(root.right,"Right child of "+root.getValue()+": ");
    }



    public void root(int val){
        if(root==null){
            node root=new node(val);
           root.left=null;
           root.right=null;
        }
    }

    public void insert(int val){}







}
