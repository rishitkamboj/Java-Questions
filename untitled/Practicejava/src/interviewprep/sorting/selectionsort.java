package interviewprep.sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={8,7,6,5,3,1};
        int n=arr.length;
        selection(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int arr[],int n){
         for(int i=0;i<n;i++){
            int last=n-i-1;
            int max=findMax(0,last,arr);
          int temp=arr[last];
          arr[last]=arr[max];
          arr[max]=temp;

         }


    }



    public static int findMax(int s,int e,int arr[]){
        int max=s;
        for (int i = s; i <=e ; i++) {
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
    }
}
