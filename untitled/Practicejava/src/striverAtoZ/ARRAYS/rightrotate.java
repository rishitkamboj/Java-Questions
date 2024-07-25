package striverAtoZ.ARRAYS;

public class rightrotate {



    public static void right(int arr[]){
        int n = arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>=1;i++){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public static void rotateright(int arr[],int k){
        int n = arr.length;
        reverse(0,n-k-1,arr);
        reverse(n-k,n-1,arr);
        reverse(0,n-1,arr);
    }

    public static void reverse(int s,int e,int arr[]){

    }
}
