class Demo {
    void m1() {
        System.out.println("In m1");
        m2();
    }

    void m2() {
        System.out.println("In m2");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        Demo obj = new Demo();
        obj.m2();
        
        obj = null;

        obj.m1();
        
        
        System.out.println("End main");
    }
}


/*  RUNTIME EXCEPTION:
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo.m1()" because "<local1>" is null
        at Demo.main(prog3.java:17)
 */