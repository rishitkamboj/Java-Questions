package striverAtoZ.LinkedList.SinglyLinkedList;

 class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }

}

public class LinkedList{
      Node head;
      public LinkedList(){}


    public void insert(int data) {
          if(head == null) {
              head=new Node(data);
              return;
          }
          Node temp=head;
          while(temp.next != null) {
              temp=temp.next;
          }
          temp.next=new Node(data);
    }
    public void display() {
          Node temp=head;
          while(temp != null) {
              System.out.print(temp.data+" ");
              temp=temp.next;
          }
          System.out.println();
    }
    public void addStart(int data) {
          if(head == null) {
              head=new Node(data);
              return;
          }
          Node newHead=new Node(data);
          newHead.next=head;
          head=newHead;
    }

    public void insertAfterPos(int data, int pos) {
          int count=1;
          if(head == null) {
               if(pos==1){
                   head=new Node(data);
                   return;
               }
               return;
          }
          Node temp=head;
          while(temp.next!=null && count<pos) {
              temp=temp.next;
              count++;
              if(temp.next==null && count<pos) {
                  System.out.println("Not enough nodes");
                  return;
              }
          }
          Node newNode=new Node(data);
          if(temp.next!=null) {
              newNode.next=temp.next;
          }
          temp.next=newNode;
    }

    public void insertAfterValue(int data,int value){
          if(head==null){
              return;
          }

          if(head.data==value){
              Node newNode=new Node(data);
              newNode.next=head.next;
              head.next=newNode;
              return;
          }
          Node temp=head;
          while(temp!=null && temp.data!=value){
              temp=temp.next;
          }
          if(temp!=null){
          Node newNode=new Node(value);
          newNode.next=temp.next;
          temp.next=newNode;
          }
    }

    public void insertBeforePos(int data, int pos) {
        int count=1;
        if(head == null) {
            if(pos==1){
                head=new Node(data);
                return;
            }
            return;
        }
        if(pos==1){
            addStart(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null && count<pos-1) {
            temp=temp.next;
            count++;
            if(temp.next==null && count<pos-1) {
                System.out.println("Not enough nodes");
                return;
            }
        }
        Node newNode=new Node(data);
        if(temp.next!=null) {
            newNode.next=temp.next;
        }
        temp.next=newNode;
    }


    public void deleteStart(){
          if(head==null){
              return;
          }
          if(head.next==null) {
              head=null;
              return;
          }
          head=head.next;
    }
    public void deleteEnd(){
          if(head==null){
              return;
          }
          if(head.next==null) {
              head=null;
              return;
          }
          Node temp=head;
          Node t=temp;
          while(temp.next!=null) {
              t=temp;
              temp=temp.next;
          }
          t.next=null;
    }

    public void DeletePos(int pos) {
        int count=1;
        if(head == null) {
            return;
        }
        if(head.next==null) {
             if(pos==1) {
                 head=null;
                 return;
             }
            System.out.println("Not enough nodes");
             return;
        }
        Node temp=head;
        Node t=temp;
        while(temp.next!=null && count<pos) {
            t=temp;
            temp=temp.next;
            count++;
            if(temp.next==null && count<pos) {
                System.out.println("Not enough nodes");
                return;
            }
        }

       if(temp.next!=null) {
           t.next=temp.next;
           return;
       }
       t.next=null;
    }


    public void reverseLL(){
          Node p1=null;
          Node p2=head;
          if(head==null || head.next==null) {
              return;
          }
          Node p3=head.next;

          while(p2!=null){
              p2.next=p1;
              p1=p2;
              p2=p3;
              if(p3!=null) {
                  p3=p3.next;
              }
          }
          head=p1;
    }
    public void sortedLL(int data){
          if(head==null || head.data>data) {
               Node neww=new Node(data);
               if(head!=null) {
                   neww.next=head;
               }
               head=neww;
               return;
          }
          Node temp=head;
          while(temp.next!=null && temp.next.data<data){
              temp=temp.next;
          }
          Node neww=new Node(data);
          neww.next=temp.next;
          temp.next=neww;
    }
    public int length(){
          if(head==null) {
              return 0;
          }
          if(head.next==null) {
              return 1;
          }
          int count=1;
          Node temp=head;
          while(temp.next!=null) {
              temp=temp.next;
              count++;
          }
          return count;
    }
    public int search(int data){
          if(head==null) {
              return 0;
          }
          Node temp=head;
          int count=1;
          while(temp.next!=null){
              if(temp.data==data) {
                  return count;
              }
              temp=temp.next;
              count++;
          }
          return 0;
    }







}
