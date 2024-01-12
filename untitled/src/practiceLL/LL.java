package practiceLL;

public class LL {
    Node start;



    public void insert(int data){
        Node newnode=new Node(data);
        if(start==null){
            start=newnode;
            return;
        }
        Node temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
         temp.next=newnode;
    }

    public void insertBeg(int data){
        if(start==null){
            insert(data);
            return;
        }
        Node newnode=new Node(data);
        newnode.next=start;
        start=newnode;
    }

    public void insertPos(int data,int index){
        if(start==null){
            System.out.println("Empty");
            return;
        }
        Node newnode=new Node(data);
        int count=1;
        Node temp=start;
        while(count<index){
            if(temp.next == null){
                System.out.println("Position not available");
                return;
            }
              temp=temp.next;
            count++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }


    private Node insertLL(Node start,int index,int el){
        if(index==0){
            Node newnode=new Node(el);
            newnode.next=start;
            return newnode;
        }
        start.next=insertLL(start.next,index--,el);

        return start;
    }

    public void insertLL(int index,int el){
        start=insertLL(start,index,el);
    }

























    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
}
