class Parent {
    Parent() {
        System.out.println("Inside parent constructor");
    }
    void property() {
        System.out.println("flat, car, gold");
    }
}
class Child extends Parent {
    Child() {
        // this();
        super();
        System.out.println("Inside child constructor");
    }    
}

class Client {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.property();
    }
}


// error:
/*
 ThisSuperInheritanceCall.java:12: error: call to super must be first statement in constructor
         super();
              ^
 ThisSuperInheritanceCall.java:11: error: recursive constructor invocation
         this();
 */