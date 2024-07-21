package DAALAB.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rightrotate {

    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99};
        rightrotate(arr,5,9);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightrotate(int arr[],int k,int n){
       List<Integer> ans=new ArrayList<>();
       ans.add(arr[k-1]);
       for(int i=0;i<n;i++){
           if(i!=(k-1)){
               ans.add(arr[i]);
           }
       }
       int a=0;
       for(int i:ans){
           arr[a++]=i;
       }
    }
    public void reverse(int s,int e,int arr[]){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
