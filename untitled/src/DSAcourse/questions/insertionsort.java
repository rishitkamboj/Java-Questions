package DSAcourse.questions;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,1};
        insertsort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void insertsort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else { break;}
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
