package hello;

import java.util.Scanner;

public class lastquestionofassignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers you want to add: ");
        int n=sc.nextInt();
        int positivesevensum=0;
        int negativesum=0;
        int positiveoddsum=0;
        while(n!=0) {
            if(n>0 && n%2==0) { positivesevensum+=n; }
            else if(n<0) { negativesum+=n; }
            else if (n>0 && n%2!=0) {positiveoddsum+=n; }
            System.out.print("Enter numbers you want to add or enter 0 to get the result: ");
            n=sc.nextInt();
        }
        System.out.println("Sum of positive even numbers: "+positivesevensum);
        System.out.println("Sum of positive odd numbers: "+positiveoddsum);
        System.out.println("Sum of negative numbers: "+negativesum);
    }
}
