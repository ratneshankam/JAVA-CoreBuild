class Outer {
    int x = 10;
    static int y = 20;

    void meth1() {
        int a = 1;
        // static int b = 2;               // error: illegal start of expression

        System.out.println(x+y);

    }

    class Inner {
        int a = 1;
        static int b = 2;               // Error actually required as modifier 'staic' is only allowed in constant variable declarations

        final static int bfin = 20;
        
        void fun() {
            System.out.println(b);
        }
    }
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.meth1();

        // static int a = 2;                // error: illegal start of expression

        Outer.Inner obj1 = obj.new Inner();
        obj1.fun();

        System.out.println(obj1.b);
        System.out.println(obj.new Inner().b);
        System.out.println(Outer.Inner.b);
        // Outer.Inner.b = 2;

    }
}