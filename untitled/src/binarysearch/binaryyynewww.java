package binarysearch;

public class binaryyynewww {
    public static void main(String[] args) {
int arr[]={ 2,7,8,9,11,15,17};
        System.out.println(binarysearch(arr,10));
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else  {
                return mid;
            }

        }
        return arr[start];
    }
}