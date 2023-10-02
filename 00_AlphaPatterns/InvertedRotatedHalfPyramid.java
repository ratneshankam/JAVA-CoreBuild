public class InvertedRotatedHalfPyramid {
    static void invertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= (n - i + 1))
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRotatedHalfPyramid(5);
    }
}