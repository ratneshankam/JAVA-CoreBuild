class C2W_2DArray {
    public static void twoDarrBasic() {
        int arr[][] = new int[3][3];

        System.out.println(arr.length);
        System.out.println(arr[2].length);

        arr = new int[3][];

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        // arr = new int[][3];              // Not allowed!!

        int arr2[][] = {{},{}};

        int a[][] = {{1,2,3},{4},{5,6}};
        System.out.println(System.identityHashCode(a[0]));
        System.out.println(System.identityHashCode(a[0][0]));


        int arr1[][] = new int[3][];
        // arr1[0] = {1,2,3};      // Array constants can only be used in initializers
        arr1[0] = new int[]{1,2,3};
        arr1[1] = new int[]{4,5};
        arr1[2] = new int[]{6};

    }

    static void twoDarrForEachPrint() {
        int arr[][] = {{1,2,3},{4},{5,6}};
        for(int[] x: arr) {
            for(int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    static void nullPointerEx() {
        int arr[][] = new int[3][];           // It only initialized
        int arr1[][] = {{},{},{}};           // It initialized and declare too.

        System.out.println(arr[0]);         // null
        System.out.println(arr1[0]);        // [I@372f7a8d
 
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr.length);
        System.out.println(arr[0].length);          // Exception Nullpointer

        System.out.println(arr[0][0]);        // Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local2>[0]" is null

        System.out.println(arr1[0][0]);        // Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local2>[0]" is null
    }

    public static void main(String[] args) {
    //    nullPointerEx();
        
    }
}