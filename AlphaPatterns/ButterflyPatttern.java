class ButterflyPatttern {
    static void revButterFlyPattern(int n) {
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
    public static void main(String[] args) {
        butterflypart2(5);
    }
}