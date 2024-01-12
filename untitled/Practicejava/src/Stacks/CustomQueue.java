package Stacks;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end=0;


    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }


    public boolean isFull() {
        return this.end == this.data.length - 1;
    }

    public boolean isEmpty() {
        return end == 0;
    }


    public void insert(int el) {
        if (isFull()) {
           return;
        }
        data[end++] = el;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 0; i < end; i++) {
            data[i ] = data[i+1];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }

}