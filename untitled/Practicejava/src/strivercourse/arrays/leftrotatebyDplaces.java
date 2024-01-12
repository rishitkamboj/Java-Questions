package strivercourse.arrays;

import java.util.Scanner;

public class leftrotatebyDplaces {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the input");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       // BRUTE FORCE APPROACH
        // Enter the position by which you want to shift the array
//        System.out.println("Enter the position by which you want to shift the array");
//        int d=sc.nextInt();
//        d%=n;
//        int temp[]= Arrays.copyOf(arr,d);
////        System.out.println(Arrays.toString(temp));
//        for (int i=d;i<n;i++){
//            arr[i-d]=arr[i];
//        }
//
//        for (int i = n-d; i <n ; i++) {
//            arr[i]=temp[i-(n-d)];
//        }
        // OPTIMAL APPROACHHHH
        //reverse till d
        //reverse till d to length
        // reverse the whole array
    }
}
