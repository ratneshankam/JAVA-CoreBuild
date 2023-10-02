public class InvertedStarPattern {
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
    public static void main(String[] args) {
        invertedStarPattern(5);
    }
    
}
