package JANUARY.LinkedList;

public class LL {
    Node head;


    Node insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    Node insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    //insert before position
    Node insertPos(int data, int pos) {
        int len = 1;
        Node newNode = new Node(data);
        Node temp = head;
        while (len < pos - 1 && temp.next != null) {
            temp = temp.next;
            len++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }


    Node reverseLL() {
        if (head == null || head.next == null) {
            return head;
        }
        Node p1 = null;
        Node p2 = head;
        Node p3 = head.next;
        while (p2 != null) {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if (p3 != null) {
                p3 = p3.next;
            }

        }
        return p1;
    }


    void display() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println("Length of LL is " + count);
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public static void main(String[] args) {
        LL ll = new LL();
        ll.head = ll.insert(1);
        ll.head = ll.insert(2);
        ll.head = ll.insert(3);
        ll.head = ll.insert(4);
        ll.head = ll.insert(5);
        ll.head = ll.insert(6);
        ll.head = ll.insert(7);
        ll.display();


        ll.display();

        ll.head = ll.reverseLL();
        ll.display();
    }

    Node insert(Node node, int index, int val) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        node.next = insert(node.next, index-1, val);
        return node;
    }
    Node mergeLL(Node head1,Node head2){
        Node head3=new Node(-1);
        Node temp1=head1;
        Node temp2=head2;
        Node temp3=head3;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp3.next=temp1;
                temp1=temp1.next;
                temp3=temp3.next;
            }
            else{
                temp3.next=temp2;
                temp2=temp2.next;
                temp3=temp3.next;
            }
        }
        while(temp1!=null){
            temp3.next=temp1;
            temp1=temp1.next;
            temp3=temp3.next;
        }
        while(temp2!=null){
            temp3.next=temp2;
            temp2=temp2.next;
            temp3=temp3.next;
        }
        return head3.next;
    }
}