package strivercourse.arrays;

import java.util.ArrayList;

public class sortarrayhaving0s1s2s {
    public static void main(String[] args) {
        // arrays would be having only 0, 1, 2s in the array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(0);

        sortt(arr);


        System.out.println(arr);
    }


    static void sortt(ArrayList<Integer> arr) {
        int low = 0;
        int mid = 0;
        int high = arr.size() - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
}








//BRUTE FORCE APPROACH
    // USe Merge Sort

    // Better solution
    //i will run a single iteration and i will keep three
    // counters for 0,1 and 2 and at the end of iteration
    // i will have the number of 0s,1s anc 2s
    //run loop and put these values by overriding new int[]

































