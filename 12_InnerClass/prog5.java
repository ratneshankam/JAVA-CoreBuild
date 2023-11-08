// Static nested inner class

class Outer {
    // System.out.println("in outer m1");               // sop --> can't be outside of class

    void m1() {
        System.out.println("in outer m1");
    }

    static class Inner {

    }
}

class Client {
    public static void main(String[] args) {
        // Inner obj = new Inner();         // Not works
        // Outer obj = new Outer();  
        
        // Outer.Inner obj = new Outer().new Inner();          // error: qualified new of static class

        Outer.Inner obj = new Outer.Inner();
    }
}