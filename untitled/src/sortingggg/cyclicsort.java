package sortingggg;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        //if numbers given from 1 to n then use cyclic sort
        int [] arr={9,8,7,6,5,4,3,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void cyclicsort(int [] arr) {
        int i=0;
        while(i<arr.length) {
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }else {i++;}
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
