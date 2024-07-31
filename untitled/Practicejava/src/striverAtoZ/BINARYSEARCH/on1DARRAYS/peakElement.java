package striverAtoZ.BINARYSEARCH.on1DARRAYS;

public class peakElement {
    public static void main(String[] args) {
        System.out.println(peak(new int[]{1,2,3,4,5,6,7,8,5,1}));
    }

    public static int  peak(int arr[]){
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        int s=1;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]>arr[mid-1]){
                s=mid+1;
            }
            else{
              s=mid-1;
            }
        }
        return -1;
    }
}
