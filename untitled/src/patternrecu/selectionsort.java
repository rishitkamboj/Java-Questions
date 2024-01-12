package patternrecu;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,78,55};
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionsort(int arr[],int r, int c,int max) {
        if(r==0) {
            return;
        }
        if(c<r) {
            if(arr[c]>arr[max]){
                selectionsort(arr,r,c+1,c);

            }
            else{
            selectionsort(arr,r,c+1,max);} }

        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(arr,r-1,0,0);


        }
    }
}
