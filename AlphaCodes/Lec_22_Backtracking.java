
public class Lec_22_Backtracking {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // fnx call step
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // Yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, ans, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" .. if want to remove c
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i=row-1; i>=0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally left
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            // count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {      // function call
                    return true;
                }
                board[row][j] = 'X';    // backtracking step
            }
        }

        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("---------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i==n-1 && j==m-1) {   // condn for last cell
            return 1;
        } else if (i==n || j==m) { // boundry cross condn
            return 0;
        }
        // recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        int total = w1 + w2;
        return total;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for (int i=0; i<=8; i++) {
            if (digit == sudoku[i][col]) {
                return false;
            }
        }
        // row
        for (int j=0; j<=8; j++) {
            if (digit == sudoku[row][j]) {
                return false;
            }
        }
        
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        
        for (int i= sr; i<sr+3; i++) {
            for (int j = sc; j<sc+3; j++) {
                if (digit == sudoku[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }
        // recursion
        int nextRow = row, nextCol = col+1;
        if (col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for (int digit=1; digit<=9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {   // soln exist
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;

    }

    public static void printSudoku(int [][]sudoku) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
        
        // int sudoku[][] = {  
        // {0,0,8,0,0,0,0,0,0},
        // {4,9,0,1,5,7,0,0,2},
        // {0,0,3,0,0,4,1,9,0},
        // {1,8,5,0,6,0,0,2,0},
        // {0,0,0,0,2,0,0,6,0},
        // {9,6,0,4,0,5,3,0,0},
        // {0,3,0,0,7,2,0,0,4},
        // {0,4,9,0,3,0,0,5,7},
        // {8,2,7,0,0,9,0,1,3} };
    }
    public static void main(String args[]) {
        char board[][] = new board[5][5];
        
    }

}
