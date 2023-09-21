// package AlphaPatterns;

public class AllPatterns {
    static void hollowRectangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n && j > 1 && j < n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedRotatedHalfPyramid() {
        int n = 4;
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

    static void numberInvertedHalfPyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void floydsTriangle() {
        int n = 5, count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }

    static void zeroOneTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    static void butterFlyPattern() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void palindromicPattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count-- + " ");
            }
            count = 2;
            for (int k = 1; k <= i-1; k++) {
                if(count==1) {
                    break;
                }
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterFlyPattern();
    }
}
