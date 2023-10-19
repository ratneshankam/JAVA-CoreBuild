class Parent {
    /*final*/ void fun() {
        System.out.println("Parent Fun");
    }
}
class Child extends Parent {
    void fun() {                                //  error: fun() in Child cannot override fun() in Parent --> overridden method is final
        System.out.println("Child Fun");
    }
}
class Client {

    public static void main(String[] args) {
        
    }
}