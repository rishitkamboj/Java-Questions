package DSAcourse.pattern;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
}
