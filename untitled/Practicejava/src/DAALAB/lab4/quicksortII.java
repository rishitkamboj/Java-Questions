package DAALAB.lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quicksortII {

    public static void main(String[] args) {
       int arr[]={3,4,6,1,2,7,5};
       quicksortt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void time(int arr[]) {
        long startTime = System.nanoTime();
        quicksortt(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println(Arrays.toString(arr));
        System.out.println(duration);
    }

    public static void quicksortt(int arr[], int s, int e) {
        if (s < e) {
            int q = quick(arr, s, e);
            quicksortt(arr, s, q - 1);
            quicksortt(arr, q + 1, e);
        }
    }

    public static int quick(int arr[], int s, int e) {
        int i = s;
        int j = e - 1;
        int key = arr[e];
        while (i <= j) {
            while (i <= e && arr[i] <= key) {
                i++;
            }
            while (j >= s && arr[j] > key) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, e, i);
        return i;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
