// see the bytecode
class Demo {
    private int x = 10;

    // private Demo() {}
    void fun() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Demo().fun();
    }
}

class Another {
    public static void main(String[] args) {
        Demo o = new Demo();
        o.fun();
        // o.x = 3;            // x has private access in Demo
    }
}