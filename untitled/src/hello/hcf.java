package hello;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers whose HCF and lcm we need to find: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int length=Math.min(num1,num2);
        int hcf=1;
        for(int i=2;i<=length;i++) {

            if(num1%i==0 && num2%i==0) {
                hcf*=i; }


            }
        int lcm=(num1*num2)/hcf;





        System.out.println(hcf+ " is the hello.hcf "+ lcm+ " is the lcm");
    }

}
