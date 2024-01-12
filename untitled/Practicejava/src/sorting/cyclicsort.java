package sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        //cyclic sort 1-----n

        int []arr={3,2,1,5,6,4};
int i=0; while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }else{i++;}
        }
        System.out.println(Arrays.toString(arr));
    }
}
