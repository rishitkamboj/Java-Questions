package arrayssss;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }


    static int getmin(int arr[],int s,int e) {
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[min]){
                min=i;

            }

        }        return min;

    }

    static void sort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int mini=getmin(arr,i, arr.length-i);
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;

                }
            }
        }
