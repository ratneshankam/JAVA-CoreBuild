interface Demo {
    default void fun() {
        System.out.println("Inside demo fun");
    }
    static void gun() {
        System.out.println("demo gun");
    }
}

interface DemoChild extends Demo {
    default void fun() {
        System.out.println("Inside demochild fun");
    }
}

class Child implements DemoChild {
    /* IT MEANS IT INHERITS AND ALLOWED TO OVERRIDE
     * error: fun() in Child cannot implement fun() in DemoChild
     * void fun() {
     * ^
     * attempting to assign weaker access privileges; was public
     */
    public void fun() {
        System.out.println("Inside demochild fun");
    }

    void gun() {         // did not give error for weaker access privileges that means that gun() did not inherits (it is interface class's method now!)
            // We can make it callable like this
            System.out.println("Child gun");
            Demo.gun();
    }
}

class Client {
    public static void main(String[] args) {
        // Static method in interface not even get's call with interface reference too.  only interface.method() works!!!
        
        // Demo obj = new Child();         // error: illegal static interface method call

        Child obj = new Child();
        obj.gun();
    }
}