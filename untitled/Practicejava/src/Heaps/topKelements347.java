package Heaps;
import java.util.*;

public class topKelements347 {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int res[]=new int[k];
        int t=0;
        for(int i:nums){
            pq.offer(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
           int a=pq.remove();
            int flag=1;
            for(int j=0;j<k;j++){
                int b=pq.remove();
                if(a!=b){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
              res[t++]=a;
            }
        }

return res;
    }
}
