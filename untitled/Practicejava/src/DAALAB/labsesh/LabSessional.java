package DAALAB.labsesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabSessional {

    static void merge (int s,int m,int e,int arr[]){
        int i=s;
        int j=m+1;
        int k=0;
        int temp[]=new int[e-s+1];

        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
              temp[k++]=arr[j++];
            }
        }

        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        for(int l=0;l<k;l++){
            arr[s+l]=temp[l];
        }
    }

    static void mergesort(int s,int e,int arr[]){
        if(s>=e){
            return;
        }
        // here the middle will make sure that the array is divided into one and thrice elements
        int mid=s+(e-s)/4;
        // recursively calling the merge function
        // this take logN
        mergesort(s,mid,arr);
        mergesort(mid+1,e,arr);
        // calling the merge function to merge
        // this takes
        merge(s,mid,e,arr);
        //overall complexity OlogN
    }


    static void sameEle(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        Arrays.sort(arr2);
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<m;i++){
            if(binarySearch(0,n-1,arr2,arr1[m])!=-1){
                ans.add(arr2[i]);
            }
        }
        System.out.println("Same elements are: ");
        for(int i:ans){
            System.out.println(i);
        }

    }
  static  int binarySearch(int s,int e,int arr[],int tar){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[mid]>tar){
            return binarySearch(s,mid-1,arr,tar);
        }
        return binarySearch(mid+1,e,arr,tar);
    }

    public static void main(String[] args) {
        int arr[]={15,16,91,84,11};
        mergesort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
}
