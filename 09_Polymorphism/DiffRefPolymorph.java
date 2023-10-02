
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void fun() {               // fun(int a)
        System.out.println("In parent fun");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    void fun(int a) {               // fun()
        System.out.println("In child fun");
    }
}

class Client {
    public static void main(String[] arg) {
        Parent obj = new Child();
        // obj.fun();         // error: method fun in class Parent cannot be applied to given types;   



    }
}