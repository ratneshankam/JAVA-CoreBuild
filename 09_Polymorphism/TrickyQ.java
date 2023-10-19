class Parent {
    int fun() {
        return 0;
    }
    Object gun() {
        return new Parent();
    }
}
class Child extends Parent {
    int fun() {                     //char fun(){}
        return 'A';
        // return 0;
    }
    String gun() {
        return "Hello";
    }
}
class Client {
    public static void main(String[] a) {
        Child c = new Child();
        System.out.println(c.fun());

        Parent p = new Child();
        System.out.println(p.gun());
    }
}

/*
 * TrickyQ.java:7: error: fun() in Child cannot override fun() in Parent
    char fun() {
         ^
  return type char is not compatible with int
 */
