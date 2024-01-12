package DSAcourse.questions;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6};
reversearr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reversearr(int arr[],int s,int e){
        if(s>e){
            return;
        }
        swap(arr,s,e);
        reversearr(arr,s+1,e-1);
    }
    static void swap(int arr[],int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}
