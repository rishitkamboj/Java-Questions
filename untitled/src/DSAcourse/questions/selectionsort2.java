package DSAcourse.questions;

import java.util.Arrays;

public class selectionsort2 {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static int min(int arr[], int s ,int e ){
        int min=s;
        for (int i = s; i <=e; i++) {
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    static void sort(int arr[]){

        for (int i = 0; i <arr.length ; i++) {
            int first =i;
            int minn=min(arr,i, arr.length-1);
            swap(arr,first,minn);
        }
    }
    static void swap(int arr[],int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
