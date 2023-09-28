public class HollowRectangle {
    public static void hollowRectangleOrig(int rows, int colmns) {
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

    static void hollowRectangle(int n) {
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
    public static void main(String[] args) {
        hollowRectangle(5);
    }
    
}
