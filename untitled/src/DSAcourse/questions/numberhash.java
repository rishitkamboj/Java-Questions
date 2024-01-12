package DSAcourse.questions;


import java.util.Scanner;

public class numberhash {
   static int hash[]=new int[10000000];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        //pre-compute 
        int hash[]=new int[10000000];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] ++;
        }

        int q;
        System.out.println("Enter a query");
        q=sc.nextInt();
        while(q!=0){
            int number;
            number=sc.nextInt();
            //fetching
            System.out.println(hash[number]);
            q--;
        }
    }
}
