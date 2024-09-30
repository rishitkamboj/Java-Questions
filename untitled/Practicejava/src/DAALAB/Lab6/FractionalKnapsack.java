package DAALAB.Lab6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class FractionalKnapsack {


    public static void main(String[] args) {

        int[] value={55,101,110};
        int[] weight={15,19,20};
        int w=60;
        double[] ratio=new double[value.length];

        for(int i=0;i< value.length;i++){

            ratio[i]=value[i]/(double)weight[i];
        }

        Arrays.sort(ratio);
        Collections.reverse(Arrays.asList(ratio));



        int total=0;
        int capacity=w;
        for(int i=0;i<value.length;i++){
            if(capacity>=weight[i]){
                capacity-=weight[i];
                total+=value[i];
            }
            else{
                total+= (int) (capacity*ratio[i]);
                break;
            }
        }

        System.out.println(total);

}


}
