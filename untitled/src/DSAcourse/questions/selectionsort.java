package DSAcourse.questions;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static int max(int arr[], int s ,int e ){
        int max=s;
        for (int i = 0; i <=e; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void sort(int arr[]){

        for (int i = 0; i <arr.length ; i++) {
            int last =arr.length-i-1;
            int maxx=max(arr,0,last);
            swap(arr,last,maxx);
        }
    }
    static void swap(int arr[],int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
