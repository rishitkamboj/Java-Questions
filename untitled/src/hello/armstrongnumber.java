package hello;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the range from smaller to greater number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for( int i=num1;i<=num2;i++) {
            int check,sum = 0,rem;
            check=i;
            while(check!=0) {
                rem=check%10;
                sum+=rem*rem*rem;
                check=check/10;
            }
            if(sum==i) {
                System.out.println(i+" is an Armstrong number");
            }

        }
    }
}