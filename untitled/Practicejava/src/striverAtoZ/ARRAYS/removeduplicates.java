package striverAtoZ.ARRAYS;

import java.util.Arrays;

public class removeduplicates {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5};
        System.out.println(removeDup(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDup(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
        }
        return (j+1);
    }
}
