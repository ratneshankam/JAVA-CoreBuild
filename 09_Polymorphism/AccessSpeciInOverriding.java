class Parent {
    int x = 3;
    void fun() {                        // combination with protected,public, private, ""blank to indicate default, because default keyword is modifier (not an access specifier)
        System.out.println("parent fun");
    }
}

class Child extends Parent {
    private int x = 3;
    void fun() {              // combination with protected,public, private, ""blank to indicate default, because default keyword is modifier (not an access specifier)
        System.out.println("Child fun");
    }

//     error: modifier default not allowed here -> default void fun() {

//      error: fun() in Child cannot override fun() in Parent
//     protected void fun() {
//                    ^
//   attempting to assign weaker access privileges; was public/package (default)/protected

}

class Client {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.fun();                      // error: fun() has private access in Parent
    }
}