package LinkedList;

public class DLL {
    private Node head;
    private  Node tail;
    private int size;

    public DLL() {
        this.size=0;
    }

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
       if(head!=null) {head.prev=node;}
        node.prev=null;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }



    public void displayRev(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void InsertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        node.prev=tail;
        tail.next=node;

        tail=node;
        size++;
        // or
     /* Node temp=head;
     while(temp.next!=null){
     temp=temp.next;}
     temp.next=head;
     size++;
      */

    }

    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;

        }
        return null;
    }

    public void Insertpos(int val,int index){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        if(index>size){
            System.out.println("Position not available");
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        size++;
    }

    public int deleteFirst(){
        int val=-1;
        if(head==null){
            System.out.println("List is empty, cant delete");
            return -1;
        }
        if(head==tail){
            val= head.value;
            head=null;
            tail=null;
            size=0;
            return val;
        }
        val= head.value;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }



    public int deleteLast(){
        int val=-1;
        if(head==null){
            System.out.println("List is empty, cant delete");
            return -1;
        }
        if(head==tail){
            val= head.value;
            head=null;
            tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        val= tail.value;
        while (temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail.prev=null;
        tail=temp;
        size--;
        return val;
    }


    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }

    public int Deletepos(int index){
        int val=-1;
        if(head==null){
            System.out.println("List is empty, cant delete");
            return -1;
        }
        if(head==tail){
            val= head.value;
            head=null;
            tail=null;
            size=0;
            return val;
        }
        Node temp=head;

        Node q=temp;
        for (int i = 1; i <index ; i++) {
            q=temp;
            temp=temp.next;

        }
        val= temp.value;
       temp.next.prev=q;
        q.next=temp.next;

        size--;

        return val;
    }

















    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
    }

}
