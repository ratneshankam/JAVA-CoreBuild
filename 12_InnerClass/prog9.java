class Parent {
    int a = 1;
    static int b = 2;

    Parent() {
        System.out.println("In par constr");
    }
    void meth1() {
        System.out.println("In parent meth1");
    }

    static void meth2() {
        System.out.println("In meth2");
    }

}

class Child extends Parent {
    int x = 1;
    static int y = 2;

    Child() {
        System.out.println("In child constr");
    }

    void meth1() {
        System.out.println("In parent's overrided child meth1");
    }

    static void meth3() {
        System.out.println("In meth3");
    }    
}

class Client {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.meth1();
        obj.meth2();
        // obj.meth3();             // Compile time Parent reference binding is different
    }
}