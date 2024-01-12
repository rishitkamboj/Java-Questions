package LinkedList;

public class LL {

    private   Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
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
    }

    public void InsertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
        // or
     /* Node temp=head;
     while(temp.next!=null){
     temp=temp.next;}
     temp.next=node;
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
        temp.next=node;
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
        size--;
return val;

    }

    public static LL merge(LL first,LL second){
        Node t1=first.head;
        Node t2=second.head;
        LL merged=new LL();
        if(t1==null){
            return second;
        }
        if(t2==null){
            return first;
        }


            while (t1 != null && t2 != null) {
        if (t1.value < t2.value) {
          merged.create(t2.value,merged);
            t1 = t1.next;
        } else if (t1.value > t2.value) {
            merged.create(t2.value,merged);
            t2 = t2.next;
        } else {
            merged.create(t1.value,merged);
            t1 = t1.next;
            t2 = t2.next;
        }
    }
    while (t1 != null) {
        merged.create(t1.value,merged);
        t1 = t1.next;
    }
    while (t2 != null) {
        merged.create(t2.value,merged);
        t2 = t2.next;
    }
    return merged;
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
        for (int i = 1; i <index-1 ; i++) {
            temp=temp.next;
        }
        val=temp.next.value;
        temp.next=temp.next.next;
        size--;

        return val;
    }

public void insertRec(int val,int index){
      head= insertRec(val,index,head);
}


private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node newnode=new Node(val,node);
            size++;
            return newnode;
        }

       node.next=insertRec(val,index-1,node.next);
        return node;
}

public boolean isHappy(int n){
        int slow= n;
        int fast=n;

        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
return false;
}

private int findSquare(int n){
        int ans=0;
        while(n>0){
            int rem=n/10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
}


//recursion reverse
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }









public void insert(int val){
        head=insert(val,head);
}

private Node insert(int val,Node node){
        Node temp=node;
        Node newnode=new Node(val);

        if(temp.next==null){
            temp.next=newnode;
            return temp;
        }
        node.next=insert(val,node.next);
        return node;
}


public void duplicate(){
        Node temp=head;

        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{

temp=temp.next;}
        }

}

public void create(int val,LL list){
        list.head=create(list,val);
}

private Node create(LL first,int val){
        Node start=first.head;
        Node newnode=new Node(val);
        if(start==null || start.value>val){
            newnode.next=start;
            start=newnode;
            return start;
        }
        Node temp=start;
        while(temp.next!=null && temp.value<val){
            temp=temp.next;
        }
        temp.next=newnode;
        return start;
}

//public Node merge(Node s1,Node s2,Node s3) {
//    s3 = null;
//    if (s1 == null) {
//        s3 = s2;
//        return s3;
//    }
//    if (s2 == null) {
//        s3 = s1;
//        return s3;
//    }
//    Node t1 = s1;
//    Node t2 = s2;
//    while (t1 != null && t2 != null) {
//        if (t1.value < t2.value) {
//            s3 = create(s3, t1.value);
//            t1 = t1.next;
//        } else if (t1.value > t2.value) {
//            s3 = create(s3, t2.value);
//            t2 = t2.next;
//        } else {
//            s3 = create(s3, t2.value);
//            t1 = t1.next;
//            t2 = t2.next;
//        }
//    }
//    while (t1 != null) {
//        s3 = create(s3, t1.value);
//        t1 = t1.next;
//    }
//    while (t2 != null) {
//        s3 = create(s3, t2.value);
//        t2 = t2.next;
//    }
//    return s3;
//}






public void dis1(LL list){

        Node temp=list.head;
        if(temp==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    System.out.println();
}




        public int hasCycle(Node head) {
            Node f=head;
            Node s=f;
            while(f!=null && f.next!=null){
                s=s.next;
                f=f.next.next;
                if(f==s){
                Node temp=s;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=s);
                return length;
                }
            }
            return 0;
        }

    public Node Cycle(Node head) {
        int length=0;
        Node fast=head;
        Node slow=fast;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
              length=hasCycle(slow);
              break;
            }
        }
       if(length==0){return null;}
       Node s=head;
       Node f=head;
        for (int i = 0; i <length ; i++) {
            s=s.next;
        }
        while(s!=f){
        s=s.next;
        f=f.next;  }
        return f;
    }



    public Node detectCycle(Node head) {
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                fast= fast.next.next;
                slow= slow.next;

                if(fast==slow){

                    Node temp=slow;
                    int length=0;
                    do{
                        temp=temp.next;
                        length++;
                    }while(temp!=slow);

                    Node s=head;
                    Node f=head;
                    for (int i = 1; i <=length ; i++) {
                        s=s.next;
                    }
                    while(f!=s){
                        f=f.next;
                        s=s.next;
                    }
                    return f;

                }
            }
            return null;
    }


    public ListNode reverseBetween(ListNode head, int left, int right) {
               if(left==right){
                   return head;
               }
           //skip the first left-1 nodes
               ListNode current=head;
               ListNode prev=null;
        for (int i = 0; current!=null &&i <left-1 ; i++) {
            prev=current;
            current=current.next;
        }
          ListNode last=prev;
          ListNode newEnd=current;

          ListNode next=current.next;
        for (int i = 0; current!=null&&i <(right-left)+1 ; i++) {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }

        }
        if(last!=null){
            last.next=prev;
        }
        else{
            head=prev;
        }

        newEnd.next=current;
        return head;
    }




    public boolean isPalindrome(ListNode head) {
             ListNode mid=middle(head);
             ListNode headsecond=reverse(mid);
             ListNode rereverseHead=headsecond;
             // compare both the halves
int flag=0;
        while(head!=null && headsecond!=null){
            if(head.val!= headsecond.val){
                flag=1;
                break;
            }
            head=head.next;
            headsecond=headsecond.next;
        }


             reverse(rereverseHead);
        if(flag==1){ return true;}
        return false;
    }





    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=fast;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head!=null){return  head;}
        if(head.next!=null){
            return head;
        }
        ListNode p1=head;
        ListNode p2=p1.next;
        ListNode p3=p2.next;
        p1.next=null;
        p2.next=p1;
        while(p3!=null){
            p1=p2;
            p2=p3;
            p3=p3.next;
            p2.next=p1;
        }
        return p2;
    }






   private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }
    }


}