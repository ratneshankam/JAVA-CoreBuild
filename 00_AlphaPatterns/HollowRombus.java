public class HollowRombus {
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
    public static void main(String[] args) {
        hollowRombus(5);
    }
    
}
