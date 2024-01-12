package DSAcourse.questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a range of numbers enter upper and lower limit");
        Scanner sc=new Scanner(System.in);
        int upper=sc.nextInt();
        int lower=sc.nextInt();
        for (int i = lower; i <=upper ; i++) {
            if(arm(i)){
                System.out.println(i+" is an armstrong number ");
            }

        }
    }
    static boolean arm(int n) {

        int digit=(int)(Math.floor(Math.log10(n))+1);
        int dup=n;
        int a=0;
        while(dup>0){
            int rem=dup%10;
            a+=Math.pow(rem,digit);
            dup/=10;
        }
        if(a==n){
            return true;
        }
        return false;
    }
}
