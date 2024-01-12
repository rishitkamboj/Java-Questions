package strivercourse.arrays;

import java.util.HashMap;
import java.util.Map;

public class subarrwithXORK {
    public static void main(String[] args) {
  int []arr={4, 2, 2, 6, 4};
  int k=6;
        System.out.println("Number of subarrays having xor 6 = "+subarraysWithXorK(arr,k));
    }


    // there is a difference of a single loop in better and brute
    static int no(int arr[], int k){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            int xorsum=0;
            for (int j = i; j < arr.length; j++) {
                xorsum=xorsum^arr[j];



                if(xorsum==k){ count++; }
            }
        }


        return count;
    }


    //optimal approach
     static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xorr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xorr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xorr = xorr ^ a[i];

            //By formula: x = xorr^k:
            int x = xorr ^ k;

            // add the occurrence of xorr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xorr)) {
                mpp.put(xorr, mpp.get(xorr) + 1);
            } else {
                mpp.put(xorr, 1);
            }
        }
        return cnt;
    }






























}
