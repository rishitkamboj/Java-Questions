package kunal.linkedlist;

import java.util.LinkedList;

public class singly {

     private Node head;
     private Node tail;

         //we can create linkedlist easily by
//        LinkedList<Integer> list=new LinkedList<>();
//        list.add(34);
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
}
