package DAALAB.lab3;

public class binarysearch {


    public int binary(int s,int e,int tar,int arr[]){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
        }
        else if(arr[mid]<tar){
            return binary(s,mid+1,e,arr);
        }
        return binary(s,mid-1,e,arr);
    }
}
