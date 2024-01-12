package arrayssss;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
     int temp;
     temp=arr[index1];
     arr[index1]=arr[index2];
     arr[index2]=temp;

    }
    static void reverse(int[] arr) {
        for(int i=0;i<=arr.length/2;i++) {
            int temp=0;
            temp=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;

        }
    }
    static  void reverse2(int [] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
