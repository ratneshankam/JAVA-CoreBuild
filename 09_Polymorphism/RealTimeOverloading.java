
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    /*private*/ void property() {               // private var & method didn't accessible to child
        System.out.println("home, car, gold");
    }
    void marry() {
        System.out.println("deepika padukone");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    void childProperty() {
        System.out.println("stocks, savings, assets");
    }
    void marry() {
        System.out.println("Alia bhatt");
    }

}

class Client {
    public static void main(String[] arg) {
        Child obj = new Child();
        obj.property();                 // error: cannot find symbol
        obj.marry();
        obj.childProperty();

        Parent obj1 = new Parent();
        obj1.property();                 // error: property() has private access in Parent
        obj1.marry();
        // obj1.childProperty();           // error: cannot find symbol

        Parent o = new Child();
        // Child o1 = new Parent();       // error: incompatible types: Parent cannot be converted to Child

        

    }
}