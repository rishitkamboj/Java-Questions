package strivercourse.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the input");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //adding the elements in HashSet it is a data structure which cannot contain duplicate values it will simply decline it
//        for (int j : arr
//        ) {
//            list.add(j);
//        }
//        int j=0;
//        for (int i:list
//             ) {
//            arr[j++]=i;
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//
//

        // MORE OPTIMAL APPROACH

        int i=0;
        for (int j = 0; j <n ; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }i++;
        System.out.println("Size of array without duplicates "+i );
        for (int j = 0; j < i; j++) {
            System.out.printf("\t %d",arr[j]);
        }


    }
}

