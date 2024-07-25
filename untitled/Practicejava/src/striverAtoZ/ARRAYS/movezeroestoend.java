package striverAtoZ.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class movezeroestoend {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0,0,4,3,2};
       opti(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void brutesol(int arr[]){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
       int k=0;
        for(int i:list){
            arr[k++]=i;
        }
        while(k< arr.length){
            arr[k++]=0;
        }

    }

    public static void opti(int arr[]){
        int k=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                k=i;
                break;
            }
        }
        if(k==Integer.MIN_VALUE){
            return;
        }
        for(int i=k+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,k);
                k++;
            }
        }

    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
