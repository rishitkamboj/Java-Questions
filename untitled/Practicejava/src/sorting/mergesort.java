package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergesort {
    public static void main(String[] args) {

        int arr[]={9,5,3,1,6,42};
        mergesortt(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void mergesortt(int s,int e,int arr[]){
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        mergesortt(s,mid,arr);
        mergesortt(mid+1,e,arr);
        merge(s,mid,e,arr);
    }
    public static void merge(int s,int mid,int e,int arr[]){
        int i=s;
        int j=mid+1;

        List<Integer> list=new ArrayList<>();
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                list.add(arr[i]);
               i++;
            }
            else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        while(j<=e){
            list.add(arr[j]);
            j++;
        }
        i=0;
        for(int ele:list){
            arr[s+i]=ele;
            i++;
        }
    }
}
