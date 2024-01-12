package binarysearch;

public class numberofrotationcount {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        int pivot=findpivot(arr);
        if(pivot==-1) {
            System.out.println("Array is not rotated");
    } else {
            System.out.println("It is rotated "+(pivot+1)+" times"); } }
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
