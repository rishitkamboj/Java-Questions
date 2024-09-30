package DAALAB.Lab5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Heap {


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
        time(asc,n);


        System.out.println("Worst case values: ");
        time(dsc,n);


        System.out.println("Average case values: ");;
        time(random,n);



    }


    public static void time(int arr[],int time){
        long startTime=System.nanoTime();

        sort(arr,time-1);
        long endTime=System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println(Arrays.toString(arr));
        System.out.println(duration);
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public  static int right(int i) {
        return 2 * i + 2;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public static void  buildmaxheap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void sort(int arr[], int size) {
        buildmaxheap(arr);
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static void  heapify(int arr[], int i, int size) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < size && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < size && arr[r] > arr[largest]) {
            largest = r;


        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, size);
        }
    }


}}
