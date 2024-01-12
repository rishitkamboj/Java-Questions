package cyclicsortquestions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
      int [] arr={1,2,2,3,4,5,5};
        System.out.println(duplicate(arr));
    }


    static List<Integer> duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //just find missing number
List <Integer> ans=new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }

        }
        return ans;
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
