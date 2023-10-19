abstract class Parent {             // 0% abstration class (nothing abstract methods) can make abstract to not allow anyone for object creation.
    void fun() {
        System.out.println("Parent Fun");
    }
    abstract void gun();
}
class Child extends Parent {
    void fun() {
        System.out.println("Child Fun");
    }
    void gun() {
        System.out.println("In child gun");
    }
}
class Client {

    public static void main(String[] args) {
    //    Parent obj = new Parent();           // error: Parent is abstract; cannot be instantiated

    //    Parent obj = new Child();             // Even parent method is abstract it only use for referencing purpose
       Child obj = new Child();
       obj.gun();
    }
}


// abstract class Parent {}

// Basic abstract class bytecode -->
// abstract class Parent {
//   Parent();
//     Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
// }