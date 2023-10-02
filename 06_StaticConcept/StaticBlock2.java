/*static*/ class Demo {                 //  error: modifier static not allowed here
    static {
        // static int x = 5;                // error: illegal start of expression

        System.out.println("Inside the static block");

        // System.exit(0);             // It will terminate the System code execution!
    }

    void fun() {
        // static {}            // error: illegal start of expression

        // static int x = 3;
    }

    /*static*/ class InsideDemo {           // works
        
        static {}
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");

    }
}