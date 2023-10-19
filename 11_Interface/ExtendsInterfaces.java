interface I1 {
    void m1();

    static void fun() {
        System.out.println("Inside static fun I1");
    }
}
interface I2 {
    void m2();

    static void fun() {                       // error: interface abstract methods cannot have body
        System.out.println("Inside static fun I1");
    }
}
interface I3 extends I1, I2 {
    void m3();
}
class Child implements I3 {
    // void fun() {
    //     System.out.println("child fun");
    // }
    public void m1() {}
    public void m2() {}
    public void m3() {}
}
class Client {
    public static void main(String[]args) {
        Child obj = new Child();
        obj.fun();
    }
}