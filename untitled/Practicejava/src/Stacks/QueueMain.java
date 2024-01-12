package Stacks;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(10);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.display();
        System.out.print(queue.remove());
        System.out.println();
        queue.display();
    }
}
