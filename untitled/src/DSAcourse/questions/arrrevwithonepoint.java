package DSAcourse.questions;

import java.util.Arrays;

public class arrrevwithonepoint {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rev(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int arr[],int s){
        if(s>=(arr.length-1)/2){
            return;
        }
        swap(arr,s,arr.length-1-s);
        rev(arr,s+1);
    }
    static void swap(int arr[],int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
