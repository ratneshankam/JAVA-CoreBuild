class Demo {
    static void fun(int x) {
        // System.out.println(x);
        fun(++x);
    }
    public static void main(String[] args) {
        // fun(1);             // Exception in thread "main" java.lang.StackOverflowError 

        try {
            fun(1);
        } catch(StackOverflowError obj) {
            // prints -> Default Exception handler like output
            System.out.println("Exception in thread '" + Thread.currentThread().getName() + "' " +  obj);
            // obj.printStackTrace();
        }
    }
}