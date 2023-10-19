interface Demo1 {
    default void fun() {
        System.out.println("Inside demo1 fun");
    }
    static void gun() {
        System.out.println("It's interface Demo1's static method (call by Demo1.gun())");
    }

}

interface Demo2 {
    default void fun() {
        System.out.println("Inside demo2 fun");
    }
    static void gun() {
        System.out.println("It's interface Demo2's static method (call by Demo2.gun())");
    }
}

class Child implements Demo1, Demo2 {
    // Try comment out RUN --> override with public (to avoid weaker access priviledges error)
    public void fun() {
    System.out.println("Inside child fun");
    }

}
class Child2 implements Demo1 {

}
class Client {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
        Demo1 obj1 = new Child();
        obj1.fun();
        Demo2 obj2 = new Child();
        obj2.fun();

        Demo1 o = new Child2();
        o.fun();
    }
}

/*
 * error: types Demo1 and Demo2 are incompatible;
 * class Child implements Demo1, Demo2 {
 * ^
 * class Child inherits unrelated defaults for fun() from types Demo1 and Demo2
 */