interface Demo {

    void fun();
    void gun();
}

// Vs code error sugges: Cannot reduce the visibility of the inherited method from Demo

abstract class Child1 implements Demo {
    public void fun() {
        System.out.println("In Child1 fun");
    } 

    // gun() is still abstract comes from interface class
}

class Child2 extends Child1 {
    public void gun() {
        System.out.println("In child2 gun");
    }
}

class Client {
    public static void main(String[] args) {
        Demo obj = new Child2();
        obj.fun();
        obj.gun();
    }    
}
