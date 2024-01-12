package binarysearch;

public class ceilingofanumber {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,1,6,18};
        int ans=ceiling(arr,15);
        System.out.println("It is the index of the smallest number greater than equal to target"+ ans);
        System.out.println(arr[ans]);
    }

    // return index
    // return -1 if value is not in array
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1]) {return -1;
        }
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
        return start;
    }
    }

