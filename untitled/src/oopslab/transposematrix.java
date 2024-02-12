package oopslab;

import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose the matrix
        int[][] trans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j] = arr[j][i];
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
