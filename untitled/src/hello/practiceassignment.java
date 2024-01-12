package hello;

import javax.crypto.spec.PSource;
import java.util.Scanner;
;
public class practiceassignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter higher number and lower number between which you want to find armstrong number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        for(int i=num2;i<=num1;i++) {
           int check=i,sum=0,rem;
           while(check!=0) {
             rem=check%10;
            if(num2<10) { rem=check;}
        sum+=rem*rem*rem;
            check=check/10;}
           if(sum==i) {
               System.out.print(i+" is an Armstrong number ");
           } }
//        System.out.print("Enter the numbers upto which you want to find average or enter 0 to find the value upto: ");
//        int n=sc.nextInt();
//        int count=1;
//        double sum=0;
//
//  while(n!=0) {
//      sum=sum+n;
//      System.out.print("Enter the numbers upto which you want to find average or enter 0 to find the value upto: ");
//      n=sc.nextInt();
//      count++;
//  }
//  double average=sum/count;
//        System.out.print("The average of numbers is "+average);
//        System.out.print("Enter a number to print its factorial: ");
//        int n=sc.nextInt();
//        long fact=1;
//        for(int i=1;i<=5;i++) {
//            fact*=i;
//        }
//        System.out.println("The factorial of "+n+" = "+fact);
//        System.out.print("Enter a number to print the largest number and it will stop taking inputs when you put 0: ");
//        int n = sc.nextInt();
//        int max = 0;
//        while (n != 0) {
//            System.out.print("Enter a number to print the largest number and it will stop taking inputs when you put 0: ");
//             n = sc.nextInt();
//            if(n>max) {
//                max=n;
//            }
//        }
//        System.out.println(max);
//int sum=0;
// for(int i=n-1;i>0;i--) {
//        if(n%i==0){ if(i==1) {
//            System.out.print(i); }
//         else {System.out.print(i+"x"); } }
//         else {continue;}
//     }
//int product=1;
//while(n!=0) {
//    int rem=n%10;
//    sum+=rem;
//    product*=rem;
//    n=n/10;
//    if(n<10) {
//        rem=n;
//    }
//}
//        System.out.println(product-sum);


    }
}
