package sortingggg;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
int [] arr={3,4,2,14,6,5};
selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }



static void selectionsort(int [] arr) {
    for (int i = 0; i <arr.length ; i++) {
        //find the max item and put at last and swap with correct index
        int last=arr.length-i-1;
        int max= getMaxindex(arr,0,last);
        swap(arr,max,last);

    }}

    static int getMaxindex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
    }
    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
