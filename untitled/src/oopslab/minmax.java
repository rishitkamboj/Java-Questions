package oopslab;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+n+" element: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        System.out.println("Minimum element= "+min+" Maximum element= "+max);

    }
}
