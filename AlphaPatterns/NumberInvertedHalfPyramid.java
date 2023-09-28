public class NumberInvertedHalfPyramid {
    public static void invertedHalfPyramidnumbers(int n) {
        // for (int i = 1; i<=n; i++) {
        //     int count = 1;
        //     for (int j = n; j>=i; j--) {
        //         System.out.print(count);
        //         count++;
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i<=n; i++) {
            for (int j =1; j<=(n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void numberInvertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberInvertedHalfPyramid(5);
    }
}