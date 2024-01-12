package LinkedList;

public class CLL {
          private Node start;

          public CLL(){

          }

          public void insert(int val){
              Node newnode=new Node(val);
              newnode.next=start;
              if(start==null){
                  start=newnode;
                  newnode.next=start;
                  return;
              }
              Node temp=start;
              while(temp.next!=start){
                  temp=temp.next;
              }
              temp.next=newnode;

          }

          public void display(){
              if(start==null){
                  System.out.println("List is empty");
                  return;
              }
              Node temp=start;
              while(temp.next!=start){
                  System.out.print(temp.value+" ");
                  temp=temp.next;
              }
              System.out.print(temp.value);
              System.out.println();
          }


          public void insertFirst(int val){

              if(start==null){
                  insert(val);
                  return;
              }
              Node newnode=new Node(val);
              Node temp=start;
              newnode.next=start;

              while(temp.next!=start){
                  temp=temp.next;
              }
              start=newnode;
              temp.next=newnode;
          }


          public int deleteFirst(){
              if(start==null){
                  return -1;
              }
              Node temp=start;
              while(temp.next!=start) {
                  temp = temp.next;
              }
              int val=start.value;
              start=start.next;
              temp.next=start;

              return val;
          }


          public int deleteLast(){
              if(start==null){
                  return -1;
              }
              Node temp=start;
              Node p=temp;
              while(temp.next!=start) {
                  p=temp;
                  temp = temp.next;
              }
              int val= temp.value;
              p.next=start;


              return val;
          }



          public void rev(){
              if(start==null){ return;}
              if(start.next==start){ return;}
              Node p1=start;
              Node p2=p1.next;
              Node p3=p2.next;

              p1.next=null;
              p2.next=p1;

              while(p3!=start){
                  p1=p2;
                  p2=p3;
                  p3=p3.next;
                  p2.next=p1;
              }
              Node temp=start;
              while(temp.next!=null){
                  temp=temp.next;
              }

              start=p2;
              temp.next=start;

          }























    public class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value=value;
        }
    }

}
