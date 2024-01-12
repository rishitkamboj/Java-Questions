package hello;

import java.util.Scanner;

public class questionsofconditionalstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a=sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b=sc.nextInt();
//        System.out.print("Enter third number: ");
//        int c=sc.nextInt();

//        if(a>b && a>c) {
//            System.out.println(a+" is the largest number");
//        }
//        if(b>a && b>c) {
//            System.out.println(b+" is the largest number");
//        }
//        else {
//            System.out.println(c+" is the largest number");

        //above code can be done with Math.max
//
//        int max=Math.max(c, Math.max(a, b));
//        System.out.println("Maximum number is "+max);
    char a=sc.next().trim().charAt(0);
    if(a>='A' && a<='Z') {
        System.out.println(a+" is an uppercase character");
    }
    else if(a>='a' && a<='z') {
        System.out.println(a+" is a lowercase character");
    }
    else {
        System.out.println("Invalid input");
    }

    }

}

