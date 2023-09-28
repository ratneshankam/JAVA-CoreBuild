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

    static void selfLogicPalindromicPattern() {
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

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n + 1; i++) {
            System.out.print("*");
        }
    }

    public static void invertedStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // OR
        // for(int i = 1; i<=n; i++) {
        // for(int j = 1; j<= n-i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }

    public static void halfPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterPattern(int n) {
        // for(int i = 1; i<=n; i++) {
        // for(int j = 1; j<=i; j++) {
        // System.out.print((char)(64+(j)));
        // }
        // System.out.println();
        // }                                        //  ...SPECIAL
        int ch = (char) 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch);
                ch++;
            }
            System.out.println();
        }
    }

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

    public static void HollowRectanglePattern(int rows, int colmns) {
        for (int i = 1; i<=rows; i++) {
            for(int j = 1; j<=colmns; j++) {
                if (i==1 || j==1 || i==rows || j==colmns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

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

    public static void floydSTrianglePattern(int n) {
        int count = 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        
    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
               if ((i+j) % 2 == 0) {
                System.out.print("1");
               } else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        for (int i=1; i<=(n); i++) {
            for (int j=1; j<=(i); j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++){
                System.out.print("_");
            }
            for (int k = 1; k<=i; k++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(i-1); space++) {
                System.out.print("_");
            }
            for (int k = 1; k<=n-i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterflypart2(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space<=2*(n-i); space++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                if (j==1 || i==1|| i==n || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(1+2*(i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int space=1; space<=(n-i); space++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(1+2*(i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramidPattern(5);
    }
}
