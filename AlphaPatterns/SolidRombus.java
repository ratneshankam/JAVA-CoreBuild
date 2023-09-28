public class SolidRombus {
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
    public static void main(String[] args) {
        solidRombus(5);
    }
    
}
