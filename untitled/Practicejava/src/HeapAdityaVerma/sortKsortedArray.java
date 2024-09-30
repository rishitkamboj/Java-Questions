package HeapAdityaVerma;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKsortedArray {


    static int[] nearlysort(int arr[],int k){
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>k){
                ans.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
         k=0;
       for(int i:ans){
            arr[k++]=i;
        }
      return arr;
    }
}
