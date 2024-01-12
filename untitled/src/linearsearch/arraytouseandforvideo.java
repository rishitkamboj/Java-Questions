package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class arraytouseandforvideo {
    public static void main(String[] args) {
        int arr[] =new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        }
    }

