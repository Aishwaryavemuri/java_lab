import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix A
        System.out.print("Rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Cols of A: ");
        int c1 = sc.nextInt();
        int[][] A = new int[r1][c1];
        System.out.println("Enter A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Matrix B
        System.out.print("Rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Cols of B: ");
        int c2 = sc.nextInt();
        int[][] B = new int[r2][c2];
        System.out.println("Enter B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Addition
        if (r1 == r2 && c1 == c2) {
            System.out.println("Sum:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print((A[i][j] + B[i][j]) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Addition not possible");
        }

        // Multiplication
        if (c1 == r2) {
            System.out.println("Product:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < c1; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication not possible");
        }

        sc.close();
    }
}