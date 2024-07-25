package striverAtoZ.ARRAYS;

import java.util.Arrays;

public class leftrotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        left(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void left(int arr[]){
        int n = arr.length;
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
}
