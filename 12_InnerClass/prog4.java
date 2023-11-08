class Outer {
    void m1() {
        System.out.println("In m1-outer");
        class Inner {
            void m1() {
                System.out.println("In m1- Inner");
            }
        }
        // Compulsory object should created here only -> outside is not possible
        Inner obj = new Inner();
        obj.m1();
    }
    void m2() {
        System.out.println("In m2-outer");
    }
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.m1();
        obj.m2();

    }
}