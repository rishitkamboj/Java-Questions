import java.util.Scanner;

public class MatrixMutliplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of rows and cols for matrix A ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        System.out.println("Enter the no of rows and cols matrix B: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] matrixA = new int[r1][c1];
        int[][] matrixB = new int[r2][c2];
        int[][] resultMatrix = new int[r1][c2];

        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }











        // Print the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
