package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {34, 22, 1, 67, 45};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i + 1; j>0; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}