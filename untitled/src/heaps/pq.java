package heaps;

import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      pq.offer(100);
      pq.offer(20);
      pq.offer(30);
        System.out.println(pq.poll());
    }
}
