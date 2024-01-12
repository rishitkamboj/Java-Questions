package strivercourse.arrays;

import java.util.HashMap;

public class subarr0 {
    public static void main(String[] args) {

    }




    int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for(int i = 0;i<n;i++) {

            sum += A[i];

            if(sum == 0) {
                maxi = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                    // prefix sum approach
                    // see if we encountered a sum value before and we r getting the same value again then that means the elements between
                    // them makes a sub array having sum 0 so just subtract the indexes
                    // and we will get the maximum length
                    // but if sum is not there in the hashmap then just put it
                }
                else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

}
