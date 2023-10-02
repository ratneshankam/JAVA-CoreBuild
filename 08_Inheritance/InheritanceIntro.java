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
        System.out.println("Inside child constructor");
    }    
}

class Client {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.property();

        // Object class is directly and indirectly parent of every class

        // Object o = new Child();          // -> Parent reference and child object is valid.
    }
}
