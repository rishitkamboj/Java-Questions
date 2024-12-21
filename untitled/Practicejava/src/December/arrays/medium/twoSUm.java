package December.arrays.medium;

import java.util.Arrays;

public class twoSUm {

    // method one two loops and check for each combo
    // method 2 sort the array and a single while loop

    int[] twoSum(int arr[],int k){
         int i=0;
         int j=arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                return new int[]{i,j};
            }
            if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }
         return new int[]{-1,-1};
    }
}
