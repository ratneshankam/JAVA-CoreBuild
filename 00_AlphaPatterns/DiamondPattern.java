public class DiamondPattern {
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
        diamondPattern(5);
    }
    
}
