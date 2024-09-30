package DAALAB.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        scanner.close();

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
        Arrays.sort(random);

        System.out.println("For the input size " + n + " the cases are as follows:");

        System.out.println("Best case values: ");
        time(asc, 8);

        System.out.println("Average case values: ");
        time(random, random[n / 2]);

        System.out.println("Worst case values: ");
        time(dsc, 8);
    }

    public static int binary(int s, int e, int tar, int arr[]) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] < tar) {
            return binary(mid + 1, e, tar, arr);
        }
        return binary(s, mid - 1, tar, arr);
    }

    public static void time(int arr[], int tar) {
        long startTime = System.nanoTime();
        int i = binary(0, arr.length - 1, tar, arr);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Index: " + i);
        System.out.println("Time taken: " + duration + " seconds");
    }
}
