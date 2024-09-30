package HeapAdityaVerma;

import java.util.PriorityQueue;

public class KthLargest {



    void kthlar(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
