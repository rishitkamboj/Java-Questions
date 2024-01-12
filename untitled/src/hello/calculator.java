package hello;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        while(true) {
            System.out.print("Enter an operation or enter 'X' or 'x' to exit the hello.calculator: ");
            char ch=sc.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter number 1: ");
                float num1 = sc.nextFloat();
                System.out.print("Enter number 2: ");
                float num2 = sc.nextFloat();
                if (ch =='+') {
                    System.out.println( num1 + num2);
                }
                if (ch =='-') {
                    System.out.println( num1 - num2);
                }
                if (ch == '/') {
                    if (num2 > 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Incorrect division");
                    } }
                    if (ch == '%') {
                        System.out.println(num1 % num2);
                    } }else if (ch == 'x' || ch == 'X') {
                        break;
                    } else {
                        System.out.println("Invalid operation");
                    }


                }
              }
            }