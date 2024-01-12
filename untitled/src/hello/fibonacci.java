package hello;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        int count =2;
//        System.out.print(a+ " "+ b+ " ");
//        while( count<=n) {
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//            System.out.print(" "+b+" ");
//        }

        int a=0;
        int b=1;
        int count=2;
        System.out.print(a+" "+b);
        while(count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            System.out.print(" "+b+" ");
        }


    }
}
