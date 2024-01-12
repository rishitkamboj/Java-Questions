package strivercourse.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayleftrotateby1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the input");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // left rotating by one place
        int j=arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=j;
        System.out.println("Rotated array is "+ Arrays.toString(arr));
    }
}
