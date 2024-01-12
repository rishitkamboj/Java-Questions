package sortingggg;

import java.util.Arrays;

public class quicksort  {
    public static void main(String[] args) {
 int arr[]={5,4,34,32,1,2};
    sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while(s<=e){
            // also a reason why if its already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct ends sort the two halves
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}
