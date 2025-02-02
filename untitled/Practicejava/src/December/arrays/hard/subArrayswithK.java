package December.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class subArrayswithK {


    int countArray(int arr[],int k){
        Map<Integer,Integer> mpp=new HashMap<Integer,Integer>();
        mpp.put(0,1);
        int xor=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            if(xor==k){
                sum++;
            }
            sum+=mpp.getOrDefault(xor^k,0);
            mpp.put(xor,mpp.getOrDefault(xor,0)+1);
        }
        return sum;
    }
}
