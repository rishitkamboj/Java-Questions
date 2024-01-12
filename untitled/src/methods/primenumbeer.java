package methods;

import java.util.Scanner;

public class primenumbeer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check is prime or not");
        int n=in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;                        for(int i=2;i<=Math.sqrt(n);i++)
        while (c * c <= n) {
            if (n % c==0) {return false;
        } c++; }
        return c * c > n;
    } }