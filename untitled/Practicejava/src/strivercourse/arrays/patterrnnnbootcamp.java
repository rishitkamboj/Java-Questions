package strivercourse.arrays;

import java.util.Scanner;

public class patterrnnnbootcamp {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        for (int i=1;i<=n;i++){

            for(int space=n-i;space>0;space--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
