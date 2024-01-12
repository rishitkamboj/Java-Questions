package strivercourse.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrangewhensizenoteven {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,-1,-2,-3,-4,7,8,9));
        System.out.println(sort(arr));
    }

    // we are not sure that if postivies r equal to negatives
// now we have to compare positive and negatives and then
// whichever is greatest we need to put at end
    static ArrayList<Integer> sort(ArrayList<Integer> arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {

                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(index, pos.get(i));
                index++;
            }

        } else {
            for (int i = 0; i < pos.size(); i++) {

                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index, neg.get(i));
                index++;
            }
        }
  return arr;
    }

}


