package methods;

import java.util.Scanner;

public class methodsss {
    public static void main(String[] args) {
int ans=sum2();
    }
    // return the value so not void
    static int sum2() {
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sum() {    Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is "+sum);
    }
}
    /* acesss modifier(we'll look in OOP ) return_type name()
 {
 //body
 return statement:}
     */
