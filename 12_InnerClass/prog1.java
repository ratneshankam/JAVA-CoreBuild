class Outer {
    class Inner {
        void m1() {
            System.out.println("In m1-Inner");
        }
    }

    void m2() {
        System.out.println("In m1-Outer");
    }
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.m2();

        // error: incompatible types: Outer.Inner cannot be converted to Outer
        // Outer obj2 = obj.new Inner();

        Outer.Inner obj2 = obj.new Inner();

        obj2.m1();
        // Outer.Inner obj2 = new Outer().new Inner();
    }
}