package striverAtoZ.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {


        DoublyLinkedList list = new DoublyLinkedList();
        list.sortedLL(9);
        list.sortedLL(8);
        list.sortedLL(7);
        list.sortedLL(1);
        list.sortedLL(2);
        list.display();

        list.reverseLL();
        list.display();
        System.out.println(list.length());
        System.out.println(list.search(7));
    }
}
