class Outer {
    Object m1() {

        System.out.println("In m1 outer");
        class Inner {
            void m1() {
                System.out.println("In m1 inner");
            }
        }
        //From prog-4 --> Compulsory object should created here only -> outside is not possible
        Inner obj = new Inner();
        obj.m1();

        return new Inner();
    }
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Object ob = obj.m1();

        ob.m1();                // error: cannot find symbol
        ob.m1().m1();           // Inner class elements can't access without creating inner class object
    }
}