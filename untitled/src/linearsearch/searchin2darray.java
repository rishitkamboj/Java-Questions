package linearsearch;

import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][]arr={
                {23,4,1},{34,12,3,9},{11,99}
        };
        int target=34;
        int[] ans=search(arr,target);// format of return vale {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println("Maximum value in the given array is: "+max(arr));

    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target) {
                    return new int[]{row,col};

                }
            }
        } return new int[]{-1-1};
    }
    //max min in 2d array
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max) {
                    max=arr[row][col];

                }
            }
        } return max;
    }
}
