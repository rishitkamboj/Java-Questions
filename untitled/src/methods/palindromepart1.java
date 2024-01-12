package methods;

import java.util.Scanner;

public class palindromepart1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is palindrome or not: ");
        int n=sc.nextInt();
        System.out.println("Given number "+n+" is palindrome: "+palindromecheck(n));

    }
    static boolean palindromecheck(int a) {
        int reversenum=0;
        int check=a;
        while(check>0) {

            int rem=check%10;
            reversenum=reversenum*10+rem;
            check=check/10;

        }
        if(reversenum==a) {
            return true;
    } return false;
} }
