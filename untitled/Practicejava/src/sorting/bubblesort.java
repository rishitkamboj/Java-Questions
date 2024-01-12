package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr={56,32,433,12,11,2,3};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
