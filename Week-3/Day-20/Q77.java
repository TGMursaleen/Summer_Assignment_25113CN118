//Matrix Multiplication

import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows and Columns for Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter Rows and Columns for Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            sc.close();
            return;
        }

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] prod = new int[r1][c2];

        System.out.println("Enter elements for Matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("\nMultiplication Result Matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}