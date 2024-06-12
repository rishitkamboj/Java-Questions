package Stacks;

public class newMain {
    public static void main(String[] args) {
        myQueue q=new myQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
//        System.out.println(q.dequeue());

        q.dequeue();
        q.dequeue();
       q.dequeue();
     q.dequeue();
      q.display();
    }
}
