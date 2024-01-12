package binarysearch;

public class rotatedwithduplicate {
    public static void main(String[] args) {

    }
    static int search(int [] nums, int target) {
        int pivot=findpivotwithduplicates(nums);
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
    static int findpivotwithduplicates(int[] arr) {
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
//            }
//            else {
//                start = mid + 1;
                //if elements at middle,start and end are equal
                if(arr[mid]==arr[start]&& arr[mid]==arr[end]) {
                 if(arr[start]>arr[start+1]) {return start;}
                 start++;
                 // check whethere end is pivot
                    if(arr[end]<arr[end-1]) {return end-1;}
                    end--;

                    //check if start is pivot
                    // note if the elements at start and end were
                    // the pivots?
                }
                //left side is sorted,so pivot sgould be in right
                else if (arr[start]< arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid])) { start=mid+1;
                }
                else {end=mid-1;
            }
        }

    }   return -1;}
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
