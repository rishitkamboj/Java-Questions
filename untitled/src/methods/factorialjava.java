package methods;

import java.util.Scanner;

public class factorialjava {
    static int factorial(int a) {
        if(a==1 || a==0) {
            return 1;
        }
        if(a>1) { long fact=1;
            for (int i=1;i<=a;i++) { fact*=i;
    } return (int)fact;
} return 0;

 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its factorial ");
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+"! : "+factorial(n));
    }
    }