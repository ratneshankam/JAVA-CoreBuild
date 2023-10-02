public class NumPyramidPattern {
    public static void numberPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = i; space <= n - 1; space++) {
                System.out.print(" ");
            }
            for (int val = 1; val <= i; val++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberPyramidPattern(5);
    }
    
}
