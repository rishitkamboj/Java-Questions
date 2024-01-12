package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i:arr) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));




    }
}
