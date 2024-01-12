package DSAcourse.questions;

import java.util.Scanner;

public class gdceasy {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
    static int gcd (int a,int b){
        while(a>0 && b>0){
            if(a>b){
               a= a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}
