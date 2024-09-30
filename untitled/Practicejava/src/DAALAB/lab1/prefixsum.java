package DAALAB.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prefixsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ans[]=prefix(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] prefix(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
        ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
}
