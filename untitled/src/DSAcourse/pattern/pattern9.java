package DSAcourse.pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int space = n-i; space >0 ; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern
        for (int i = 1; i <=n ; i++) {
            for (int space = 1; space <i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*n-(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
