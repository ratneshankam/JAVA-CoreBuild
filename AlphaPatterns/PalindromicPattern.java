class PalindromicPattern {
    static void palindromicPattern(int n) {
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
        palindromicPattern(5);
    }
}