package binarysearch;

public class floor {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,18};
        int ans=floor(arr,15);
       //index of the biggest or number less than equal to target
        System.out.println(ans);
        System.out.println(arr[ans]);
    }

    // return index
    // return -1 if value is not in array
    static int floor(int[] arr, int target) {
        
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;


            }

        }
        return end;
    }
}

