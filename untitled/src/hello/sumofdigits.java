package hello;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to sum its digits: ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0) {
            int rem=n%10;
            sum+=rem;
            n=n/10;

        }
        System.out.println(sum);
    }
}
