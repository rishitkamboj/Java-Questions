package DAALAB.lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] asc = new int[n];
        int[] dsc = new int[n];
        int[] random = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            asc[i] = i;
        }
        for (int i = n - 1; i >= 0; i--) {
            dsc[k++] = i;
        }
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            random[i] = rand.nextInt(1000);
        }

        System.out.println("For the input " + n + " the cases are as follows:");

        System.out.println("Best case values: ");
        time(asc);


        System.out.println("Worst case values: ");
        time(dsc);


        System.out.println("Average case values: ");;
        time(random);



    }
    public static void time(int arr[]){
        long startTime=System.nanoTime();
       quicksortt(arr, 0, arr.length-1);
        long endTime=System.nanoTime();
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
        int i = s + 1;
        int j = e;
        int key = arr[s];
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
        swap(arr, s, j);
        return j;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
