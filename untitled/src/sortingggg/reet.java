package sortingggg;

import java.util.Scanner;
import java.util.Arrays;

public class reet {
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
//O(n^2)

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Create an array");
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The array you created is:"+" "+Arrays.toString(arr));
        System.out.println("sorted array is:");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}