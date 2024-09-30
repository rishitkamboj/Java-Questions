package interviewprep.sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={8,7,6,5,3,1};
        int n=arr.length;
        bubblesort(arr,n);
        System.out.println(Arrays.toString(arr));
    }



    public static void bubblesort(int arr[],int n){
         for(int i=0;i<n;i++){
             for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;

                 }
             }
         }
    }
}
