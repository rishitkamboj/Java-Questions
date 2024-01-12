package binarysearch;

public class orderagnosticbinnary {
    public static void main(String[] args) {
int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(orderagnosticbinary(arr,7));
    }
    static int orderagnosticbinary(int [] arr, int target) {
        int s=0;
        int end=arr.length-1;
        boolean isAsc=arr[s]<arr[end];
        while(s<=end) {
            int mid=s+(end-s)/2;

            if(arr[mid]==target) {
                return mid;
            }
            if(isAsc=true) {
                if(target<arr[mid]) {
                    end=mid-1;
                }
                else {
                    s=mid+1;

                }
            }
            if(isAsc=false) {
                if(target<arr[mid]) {
                    s=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;

    }
}
