package hello;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check whether it is perfect or not: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                sum+=i;
            }
        } if(sum==n) {
            System.out.print(n+" is a perfect number");
        } else {
            System.out.println(n+ " is not a perfect number");
        }
    }
}
