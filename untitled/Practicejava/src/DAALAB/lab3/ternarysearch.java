package DAALAB.lab3;

public class ternarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(ternary(0, arr.length-1, arr,8));
    }


    public static int ternary(int s,int e,int arr[],int tar){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/3;
        int mid2 = e - (e - s) / 3; // mid2= 2*mid


        if(arr[mid]==tar){
            return mid;
        }
        if(arr[mid2]==tar){
            return mid2;
        }
        if(arr[mid]>tar){
            return ternary(s,mid-1,arr,tar);
        }
        else if(arr[mid]<tar &&  arr[mid2]>tar){
            return ternary(mid+1,mid2-1,arr,tar);
        }
        return ternary(mid2+1,e,arr,tar);
    }
}

