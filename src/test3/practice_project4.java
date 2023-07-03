package test3;

import java.util.Scanner;

public class practice_project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = sc.nextInt();
        
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = sc.nextInt();
        
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible.");
            sc.close();
            return;
        }
        
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        
        System.out.println("Enter the elements of the first matrix:");
        readMatrixElements(matrix1, sc);
        
        System.out.println("Enter the elements of the second matrix:");
        readMatrixElements(matrix2, sc);
        
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
        
        System.out.println("Resultant matrix after multiplication:");
        displayMatrix(resultMatrix);
        
        sc.close();
    }
    
    public static void readMatrixElements(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        
        int[][] resultMatrix = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return resultMatrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
