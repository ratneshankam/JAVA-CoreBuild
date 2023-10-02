public class CharPattern {
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
    public static void main(String[] args) {
        characterPattern(5);
    }
    
}
