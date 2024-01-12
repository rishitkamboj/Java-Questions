package methods;

import java.util.Scanner;

public class primenumberbymethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range of number to check whether it is prime or not: ");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       for(int i=Math.min(num1,num2);i<=Math.max(num1,num2);i++) {
           if(isPrime(i)==true) {
               System.out.print(i+" ");
           }
       }

    }

    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        int c = 2;
        while (c * c < a) {
            if (a % c == 0) {
                return false;
            }
            ++c;

        }
        return true;
    }



    }
