package striverAtoZ.ARRAYS;

import java.util.Arrays;

public class secondlargest {
    //convert it for second smallest

    public static void main(String[] args) {
        System.out.println(optimal(new int[]{1,2,3,4,5,6,8,9,11}));
    }


    public static int brute(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int optimal(int arr[]){
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sMax=max;
                max=arr[i];
            }
            else if(arr[i]>sMax && arr[i]!=max){
                sMax=arr[i];
            }
        }
        return sMax;
    }
}
