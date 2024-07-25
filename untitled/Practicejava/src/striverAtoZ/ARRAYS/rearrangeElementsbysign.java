package striverAtoZ.ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class rearrangeElementsbysign {


    public static int[] rearrange(int arr[]){
        List<Integer> pos=new ArrayList<Integer>();
        List<Integer> neg=new ArrayList<>();
            for(int i:arr){
                if(i>=0){
                    pos.add(i);
                }
                else{
                    neg.add(i);
                }
            }
            for(int i=0;i<arr.length/2;i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            return arr;
    }
}
