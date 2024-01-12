package strivercourse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rearrangearrayitem {
    public static void main(String[] args) {
//array of size N (it would be even) half would be positives and while the
        // other half would be negatives
        // sort the array in alternating positives and negatives
        // ORDER IS MAINTAINED
ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,-1,-2,-3,-4));
        System.out.println(sort(arr));
    }


    // BRUTE FORCE
    // traverse in the array and fill positives and negatives
    // take a positive array
    // take a negative array
    /* positive elements are at the even indexes while
    the negative elements are at the odd indexes
     */

  // OPTIMAL
    // let us take answer array all the positive index at even
    // first negative at first index
    static ArrayList<Integer> sort(ArrayList<Integer> arr){
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(arr.size(),0));
        int pos=0;
        int neg=1;
        for (int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                ans.set(neg,arr.get(i));
                neg+=2;
            }
            else {
                ans.set(pos,arr.get(i));
                pos+=2;
            }
        }
        return ans;
    }

}
