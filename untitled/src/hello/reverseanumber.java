package hello;

import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0) {
            int rem=n%10;
            count=(count*10)+rem;
            n/=10;
        }
        System.out.println(count);
    }
}
