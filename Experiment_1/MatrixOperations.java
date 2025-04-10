import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] result = new int[2][2];

        
        System.out.println("Enter elements of Matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of Matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nChoose Operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Transpose of Matrix A and B");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Matrix Addition
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrixA[i][j] + matrixB[i][j];
                    }
                }
                System.out.println("\nResult of Addition:");
                printMatrix(result);
                break;

            case 2: // Matrix Multiplication
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += matrixA[i][k] * matrixB[k][j];
                        }
                    }
                }
                System.out.println("\nResult of Multiplication:");
                printMatrix(result);
                break;

            case 3: // Transpose
                System.out.println("\nTranspose of Matrix A:");
                printMatrix(transpose(matrixA));
                System.out.println("\nTranspose of Matrix B:");
                printMatrix(transpose(matrixB));
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

   
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

  
    static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
