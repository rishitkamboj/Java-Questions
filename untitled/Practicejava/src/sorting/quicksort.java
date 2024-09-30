package sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {

        int arr[]={6,5,2,1,3};
        quicksort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }




public static void quicksort(int s,int e,int arr[]){
    if(s>=e){
        return;
    }
    int p=pivot(s,e,arr);
    quicksort(s,p-1,arr);
    quicksort(p+1,e,arr);
}

public  static int pivot(int s,int e,int arr[]){
    int key=arr[s];

    int i=s+1;
    int j=e;
    while(i<=j){
       while( i<=e && arr[i]<=key){
            i++;
        }
        while(j>=s && arr[j]>key ){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[s];
    arr[s]=arr[j];
    arr[j]=temp;
    return j;
}

}


