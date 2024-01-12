package maths;

import java.util.Arrays;


public class findnotduplicate {
    public static void main(String[] args) {


//        int arr[] = {1, 2, 1, 2, 3, 4, 5, 6, 7, 4, 5, 6, 7};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] ^ arr[i];
//
//
//int [] arr1={-1,1,2,-2,3,-4,4};
//int sum=0;
//        for (int i = 0; i < arr1.length; i++) {
//            sum+=arr1[i];
//        }
//        System.out.println(sum);
        
        int arr[] ={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
        
        
        
      }

    private static int ans(int[] arr) {
        int unqiue=0;
        for(int n: arr) {
            unqiue^=n;
        }
        return unqiue;
    }

}