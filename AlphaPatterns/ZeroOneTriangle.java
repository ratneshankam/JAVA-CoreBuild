class ZeroOneTriangle {
    public static void zeroOneTriangleOrig(int n) {
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
    static void zeroOneTriangle(int n) {
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
    public static void main(String []args) {
        zeroOneTriangle(5);
    }
}