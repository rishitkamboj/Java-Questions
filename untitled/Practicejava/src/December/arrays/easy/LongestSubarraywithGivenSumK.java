package December.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithGivenSumK {


    int length(int arr[],int k){
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                len=Math.max(len,i+1);
            }
            int rem=sum-k;

            if(map.containsKey(rem)){
                len=Math.max(len,map.get(rem)+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
    int positive(int arr[],int k){
        int sum=0;
        int i=0;
        int j=0;
        int len=0;
        while(i<arr.length){
            sum+=arr[i];
            if(sum==k){
                len=Math.max(len,i-j+1);
            }
            while(sum>k){
                sum-=arr[j];
                j++;
            }
            i++;
        }
        return len;
    }
}
