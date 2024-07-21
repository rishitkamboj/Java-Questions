package DAALAB.lab1;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestsmallest(new int[]{2, 4, 5, 6}, 4)));
    }


   public static int[] largestsmallest(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }
            if(arr[i]<min2 && arr[i]!=min){
                min2=arr[i];
            }
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }

        }
        return new int[]{min2,max2};
    }
}
