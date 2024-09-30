package DAALAB.lab2;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

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
        insertionSort(asc, n);

        System.out.println("Average case values: ");
        insertionSort(random, n);

        System.out.println("Worst case values: ");
        insertionSort(dsc, n);
    }

    public static void insertionSort(int[] arr, int n) {
        int s = 0;
        int steps = 0;

        for (int i = 1; i < n; i++) {
            s++;
            int key = arr[i];
            s++;
            int j = i - 1;
            s++;

            while (j >= 0 && arr[j] > key) {
                s++;
                arr[j + 1] = arr[j];
                s++;
                j--;
                steps++;
                s++;
            }
            arr[j + 1] = key;
            s++;
        }

        System.out.println("Number of steps in between each statement = " + s);
        System.out.println("Number of steps just inside while loop = " + steps);
    }
}
