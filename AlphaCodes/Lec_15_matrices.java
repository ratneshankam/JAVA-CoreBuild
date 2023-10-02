import java.util.Scanner;

public class Lec_15_matrices {
    public static boolean twoDLinearSearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void printMatrix(int matrix[][]) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void largestMatEle(int matrix[][]) {
        int maxEle = Integer.MIN_VALUE; int n=0, m=0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] > maxEle) {
                    maxEle = matrix[i][j];
                    n = i; m = j;
                }}}
                System.out.format("The maximum element is %d and is at matrix[%d][%d] position.", maxEle, n, m);
        int minEle = Integer.MAX_VALUE;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] < minEle) {
                    minEle = matrix[i][j];
                    n = i; m = j;
                }}}
                System.out.printf("The minimum element is %d and is at matrix[%d][%d] position.", minEle, n, m);
    }

    public static void inputMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix element: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0; int startCol = 0;
        int endRow = matrix.length-1; int endCol = matrix[0].length-1;

        while ((startRow <= endRow) && (startCol <= endCol)) {
            // Top
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]  + " ");
            }
            // Bottom
            for (int j=endCol-1; j>=startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left
            for (int i=endRow-1; i>=startRow+1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // Brute Force Approach     - >     O(n^2)

        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (i==j) {
        //             sum += matrix[i][j];
        //         } else if ((i+j) == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // Optimized Approach       - >     O(n)    
        for (int i=0; i<matrix.length; i++) {
            // PrimaryDiagonal
            sum += matrix[i][i];
            // SecondaryDiagonal
            if (i != (matrix.length-1-i)) {
                sum += matrix[i][matrix.length - 1 - i];}
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0; int col = matrix[0].length-1;
        while ((row < matrix.length) && (col >= 0)) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at [" + row + ", " + col + "]");
                return true;
            } else if (matrix[row][col] > key) {
                // row++;
                col--;
            } else {
                // col--;
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static int noOfElement(int[][] matrix) {
        int count = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count ++;
                }
            }
        }
        return count;
    }
    public static int sumOfRowElement(int[][] matrix, int rowNO) {
        int sum = 0; 

            for (int j=0; j<matrix[0].length; j++) {
                sum += matrix[rowNO][j];
            }
        return sum;
    }
    public static void transposeMatrix(int[][] matrix) {
        int row = matrix.length; int col = matrix[0].length;
        int transpose[][] = new int [col][row];
        for (int i=0; i<row; i++) {
             for (int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
                System.out.print(transpose[j][i] + " ");
             }
             System.out.println();
        }
        // Working outside the of the methods
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        printMatrix(matrix);
        int row = matrix.length; int col = matrix[0].length;
        int transpose[][] = new int [col][row];
        for (int i=0; i<row; i++) {
             for (int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
             }
        }
        printMatrix(transpose);
    }

}
