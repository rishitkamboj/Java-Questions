package Stacks;

public class StackusingLL {
   private Node start;
   private int top=-1;

    public void push(int el){
        Node newnode=new Node(el);
        if(start==null){
            start=newnode;
            top=0;
            return;
        }
        newnode.next=start;
        start=newnode;
        top++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
          throw new Exception("Cant pop from empty stack");
        }
        Node temp=start;

        int remove=temp.data;
        start=start.next;
        return remove;

    }
    private boolean isEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Cant display from empty stack");
        }
        Node temp=start;
        while(temp!=null){
            System.out.printf("\t %d",temp.data);
            temp=temp.next;
        }
    }








    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
}
