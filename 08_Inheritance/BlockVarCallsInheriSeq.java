class Parent {
    int x = 30;
    static int y = 40;

    {
        System.out.println("parent Instance block");
    }

    Parent() {
        System.out.println(this.x);
        System.out.println("Parent Constructor");
    }

    static {
        System.out.println("parent static block");
    }

    static void statMeth() {
        System.out.println("parent static method");
    }

    void meth() {
        System.out.println("parent method");
    }

}

class Child extends Parent {
    static {
        System.out.println("child static block");
    }

    
    {
        System.out.println("child Instance block");
    }

    Child() {
        super();
        //this();

        // --> error: 'void' type not allowed here
        // System.out.println(this());
        // System.out.println(super());

        System.out.println(this);           // works
        // System.out.println(super);          // error: '.' expected
        System.out.println(super.x);
        
        System.out.println("child constructor.");

        // super.meth();            // similar method for parent and child can be call like this
    }
    
    static void statMethC() {
        System.out.println("child static method");
    }
    

    void meth() {
        System.out.println("Just similar method as in parent");
    }

    void methC() {
        System.out.println("Child  method");
    }
}

class Client {
    static {
        System.out.println("Client's static block");
    }
    Client() {
        System.out.println("Client's constructor");
    }
    public static void main(String[] args) {
        System.out.println("main()");

        Child obj = new Child();
        obj.x = 4;

        // obj.meth();
    }

}