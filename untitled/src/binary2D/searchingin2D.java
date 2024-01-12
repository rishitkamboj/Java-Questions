package binary2D;

import java.util.Arrays;

public class searchingin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
};System.out.println(Arrays.toString(search2d(arr,38)));
        }


    //    static int[] search(int[][] matrix,int target) {
//        int r=0;
//        int c=matrix[r].length-1;
//
//        while(r<matrix.length && c>=0) {
//            if(matrix[r][c]==target) {
//                return new int[]{r,c};
//            }
//            if(matrix[r][c]<target){
//                r++;
//            }
//            else { c--;}
//        } return new int[]{-1,-1};
    static int[] search2d(int[][] arr, int target) {
        int r = 0;
        int c = arr[r].length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
