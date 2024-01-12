package DSAcourse.pattern;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
