class Demo {
    // "this" only used in non-static context not in static context 
    static void meth1() {
        // System.out.println(this);
        // error: non-static variable this cannot be referenced from a static context
    }

    void fun(Demo this, int x) {                // manually this works!
        System.out.println(this);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        // System.out.println(this);            // error as main is also static

        System.out.println(obj);
        obj.fun(1);                 // works!
        // obj.fun(obj, 2);              // But here isn't


        obj.meth1();        // works! but static way of call recommended
    }
}