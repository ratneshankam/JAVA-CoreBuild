// JAVA IS A CALL BY VALUE --> IS COPY MODIFIED NOT THE ORIGINAL DATA CHANGES

class C2W_ArrayDemo {
    
    static void arrBasic() {
        int arr[];                              // It's a declaration --> so, no error
        // int arr1[] = new int[];              // error: array dimension missing

        // 2 way of initializing array with values (internally both are same)
        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = {1,2,3,4};

        // int arr3[] = new int[3]{1,2,3};
        // --> error: array creation with both dimension expression and initialization is illegal

    }

    static void defaultValuesArr() {
        // Default values for datatypes store in arr like --> in cpp it's a garbage value
        
        // String obj[] = new String[5];           // for all wrapper class is "null" as default
        // Integer obj[] = new Integer[5];           // null
        // int obj[] = new int[5];           // 0
        // double obj[] = new double[5];           // 0.0
        // float obj[] = new float[5];           // 0.0
        // long obj[] = new long[5];           // 0
        // char obj[] = new char[5];           // ""
        // System.out.println("hello"+ obj[0] + "world");
        boolean obj[] = new boolean[5];           // false
        System.out.println(obj[5]);                 // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }

    static void identityHC() {
        int arr[] = {65,66,67,-128, 128};
        int a[] = {65,-128,128,129};
        
        int carr[] = {'A','B','C', };
        // char arr[] = {65,66,67};
        // char carr[] = {'A','B'};
        boolean b[] = {true, false};

        System.out.println(System.identityHashCode(carr[0]));
        System.out.println(System.identityHashCode(carr[2]));           // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        System.out.println(System.identityHashCode(b[0]));
        
        // identityHashCode() gives same output for only -128 to +127
        System.out.println(System.identityHashCode(a[1]));
        System.out.println(System.identityHashCode(arr[3]));
    }
    
    static void intCacheAutoBoxing() {
        // If value is in range of -128 to 127 it goes to integer cache(same for String contant pool)
        // intergerCache values are autoBox it as wrapper class
        // It's values are same for int and it's wrapper class only!

        int x = 65;
        int inch = 'A';
        Integer i = 65;
        
        char c = 65;
        char ch = 'A';
        
        byte b = 65;
        short s = 65;
        long l = 65;
        
        float f = 4f;
        float f1 = 4.0f;

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(inch));
        System.out.println(System.identityHashCode(i));
        
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(l));
        
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(ch));

        System.out.println(System.identityHashCode(f));
        System.out.println(System.identityHashCode(f1));
    }
    
    public static void main(String[] args) {
        intCacheAutoBoxing();
    }
}