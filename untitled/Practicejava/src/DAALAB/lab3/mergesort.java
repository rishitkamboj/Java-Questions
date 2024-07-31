package DAALAB.lab3;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[]={9,8,6,5,3,2,1};
        mergesort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }




   public static  void mergesort(int s,int e,int arr[]){
       if (s >= e) {
           return;
       }
       int mid = s + (e - s) / 2;
       mergesort(s, mid, arr);
       mergesort(mid + 1, e, arr);
       merge(s, mid, e, arr);

    }

    public static void merge(int s, int mid, int e, int arr[]) {
        int[] merge = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = arr[i++];
        }
        while (j <= e) {
            merge[k++] = arr[j++];
        }
        for (int p = 0; p < merge.length; p++) {
            arr[s + p] = merge[p];
        }
    }
}
