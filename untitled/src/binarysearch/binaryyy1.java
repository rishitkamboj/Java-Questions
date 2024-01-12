package binarysearch;

import java.util.Scanner;

public class binaryyy1 {
    public static void main(String[] args) {
 int [] arr={2,3,4,5,6,7,15};
int ans=bin(arr,0,arr.length-1,5);
        System.out.println(ans);
    }

    // return index
    // return -1 if value is not in array
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;


            }

        }
        return -1;
    }


    static int bin(int []arr,int s,int e, int x){
        int mid=s+(e-s)/2;

        if(arr[mid]<x){
            return bin(arr,mid+1,e,x);
        }

        else if(arr[mid]>x){
            return bin(arr,s,mid-1,x);
        }
else if(arr[mid]==x){
        return mid;}


return -1;
}}