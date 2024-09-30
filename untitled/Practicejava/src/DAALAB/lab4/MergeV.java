package DAALAB.lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeV {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter the size of the array: ");
//        int n = scanner.nextInt();
//
//        int[] asc = new int[n];
//        int[] dsc = new int[n];
//        int[] random = new int[n];
//        int k = 0;
//
//        for (int i = 0; i < n; i++) {
//            asc[i] = i;
//        }
//        for (int i = n - 1; i >= 0; i--) {
//            dsc[k++] = i;
//        }
//        Random rand = new Random();
//        for (int i = 0; i < n; i++) {
//            random[i] = rand.nextInt(1000);
//        }
//
//        System.out.println("For the input " + n + " the cases are as follows:");
//
//        System.out.println("Best case values: ");
//        time(asc);
//
//        System.out.println("Average case values: ");;
//        time(random);
//
//        System.out.println("Worst case values: ");
//        time(dsc);
        int arr[]={54,26,93,17,77,31,44,55,20};
        mergesort(0,arr.length-1,arr);

        System.out.println(Arrays.toString(arr));



    }




    public static  void mergesort(int s,int e,int arr[]){
        if (s >= e) {
            return;
        }
     //   int mid = s+2*(e-s)/3;
//        int mid=e-(e+s)/4;

        int mid1=e-(e-s)/3;
        int mid=s+2*(e-s)/3;

        System.out.println("Mid is (s+2*) "+mid);
        System.out.println("Mid 2 is (e-e) " +mid1);
        mergesort(s, mid, arr);


        mergesort(mid + 1, e, arr);
        merge(s, mid, e, arr);

    }
    public static void time(int arr[]){
        long startTime=System.nanoTime();
        mergesort(0,arr.length-1,arr);
        long endTime=System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println(Arrays.toString(arr));
        System.out.println(duration);
    }

    public static void merge(int s, int mid, int e, int arr[]) {
        int[] merge = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = arr[i++];
        }
        while (j <= e) {
            merge[k++] = arr[j++];
        }
        for (int p = 0; p < merge.length; p++) {
            arr[s + p] = merge[p];
        }
    }
}

