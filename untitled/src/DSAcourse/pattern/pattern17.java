package DSAcourse.pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int space = 1; space <n ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)('A'+j-1));
            }
            for (int k = 1; k<i ; k++) {
                System.out.print((char)('A'+n-k-1));
            }
            System.out.println();
            }

        }
    }

