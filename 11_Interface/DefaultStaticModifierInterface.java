interface Demo {
    static void fun() {
        System.out.println("Inside fun");
    }

    default void gun() {
        System.out.println("Inside gun");
    }
}

class DemoChild implements Demo {

}

class Demo2 {
    static void fun() {
        System.out.println("In demo2 fun");
    }
}
class DemoChild2 extends Demo2 {

}
class Client {
    public static void main(String[] args) {
        Demo obj = new DemoChild();
        // obj.fun();                  // This static method of interface Demo can only be accessed as Demo.fun
        // Error for above --> error: illegal static interface method call

        
        
        Demo.fun();
        obj.gun();

        Demo2 o = new DemoChild2();
        o.fun();
    }
}

/*
 * error: illegal static interface method call
 * obj.fun();
 * ^
 * the receiver expression should be replaced with the type qualifier 'Demo'
 */