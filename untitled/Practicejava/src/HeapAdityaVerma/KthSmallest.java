package HeapAdityaVerma;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {



    static int kthsmall(int arr[],int k){
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            q.add(i);
            if(q.size()>k){
                q.remove();
            }
        }
        return q.remove();
    }
}
