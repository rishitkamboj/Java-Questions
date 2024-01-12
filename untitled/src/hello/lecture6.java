package hello;

import java.util.Scanner;

public class lecture6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=1;
        int n=input.nextInt();
//        while(num<=n) {
//            System.out.print(num+" ");
//            num++;
// while loop is used when we dont know when how many times the loop is going
            // to run
            // for loop is used when we know the number of iteration

        do{
            System.out.print(num+" ");
            num++;
        }while(num<=n);
    }
}
// the major difference between while and do while loop is that
// a do while loop will execute at least once !!!
