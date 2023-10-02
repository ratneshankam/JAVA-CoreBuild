class Demo {
    void fun(Object o) {
        System.out.println("object o");
    }
    // void fun(String s) {
    //     System.out.println("String s");
    // }
    public static void main(String[] ar) {
        String s = null;
        StringBuilder sb = null;
        System.out.println(System.identityHashCode(s) + "\n" + System.identityHashCode(sb));            // 0 0 

        Object arr[] = {1,2.2f, 3.5, "hello", 'A', new Demo(), null};

        // for (Object x: arr) {
        //     System.out.print(x+" ");
        // }

        // Object class gives priority to it's child class for method variables and even null pointer also

        Demo obj = new Demo();
        obj.fun("c2w");
        obj.fun(null);
        obj.fun(new StringBuilder("hello"));
    }
}

