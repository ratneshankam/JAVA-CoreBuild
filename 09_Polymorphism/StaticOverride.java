class Parent {
    static void fun() {
        System.out.println("Parent Fun");
    }
}
class Child extends Parent {
    /*static*/ void fun() {                                //  error: fun() in Child cannot override fun() in Parent --> overridden method is static
        System.out.println("Child Fun");
    }
}
class Client {

    public static void main(String[] args) {
       Parent obj = new Child();
       obj.fun(); 
    }
}