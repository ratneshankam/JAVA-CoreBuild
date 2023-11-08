class Parent {
    int x = 10;
    void m1() {
        System.out.println("In parent m1");
    }
}

class Child extends Parent {
    int a = 20;
    void m2() {
        System.out.println("In child m2");   
    }
}

class Demo {
    Demo(Parent p) {
        System.out.println("In Constr-parent ->"+ p.x);
        
        // p.x;            // error: not a statement
        p.m1();
    }

    Demo(Child c) {
        System.out.println("In constr-child ->"+ c.a);
        c.m2();
    }

    public static void main(String[] args) {
        Demo obj = new Demo(new Parent());

        Demo obj1 = new Demo(new Child());
    }
}

