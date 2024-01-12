package binarysearch;

public class rotatedarrayyy {
    public static void main(String[] args) {
int[] arr={4,5,6,7,0,1,2};
int pivot=findpivot(arr);
        System.out.println("Index of the pivot element is: "+pivot);
        System.out.println("The pivot element is: "+arr[pivot]);
    }
static int search(int [] nums, int target) {
        int pivot=findpivot(nums);
        //if you did not find a pivot, it means the array is not
    // is sorted
    if(pivot==-1) {
        // just do normal binary search
        return binarysearch(nums,target,0,nums.length-1);

}// if pivot is found then there will be 2 sorted arrays
    if(nums[pivot]==target) {
        return pivot;
    }
    // 3 cases
    if(nums[0]<=target) {
        return binarysearch(nums,target,0,pivot-1);
    }
    else {
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    // find answer using pivot
    //
    }
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
    static int binarysearch(int[] arr, int target,int start,int end) {

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