package recursions;

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,11};
        System.out.println(binary(arr,5,0,arr.length-1));
    }
    static int binary(int [] arr,int search,int s, int e) {
        if(s>e) {
            return -1;
        }
        int m=s+(e-s)/2;
        if( search==arr[m]) {
            return m;
        }

        if(arr[m]<search) {
            return binary(arr,search,m+1,e);
        }
        return binary(arr,search,s,m-1);
    }
}
