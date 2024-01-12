package DSAcourse.pattern;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            char ch='A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
