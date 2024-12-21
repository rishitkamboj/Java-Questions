package December.arrays.easy;

import java.util.Arrays;

public class secondLargest {

    public static void main(String[] args) {
        int arr[]={9,2,4,1,5,-1};

        System.out.println(Arrays.toString(index(arr)));
    }

 static   int[] index(int arr[]){
        // first method sort the array and take the second index

        // one pass method
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            if(arr[i]<min2 && arr[i]!=min1){
                 min2=arr[i];
            }
        }
        return new int[]{min1,min2};
    }
}
