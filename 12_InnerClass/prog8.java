class Demo {
    Demo() {
        System.out.println("In Demo constr");
    }
}
class DemoChild extends Demo {
    // Demo() {                                    // error: invalid method declaration; return type required
    DemoChild() {
        System.out.println("In Demochild constr");
    }
}

class Parent {
    Parent() {
        System.out.println("In parent constr");
    }

    Demo meth1() {
        System.out.println("In parent meth1");
        return new Demo();
    }
}

class Child extends Parent {
    Child() {
        System.out.println("In child constr");
    }

    DemoChild meth1() {                         // If remove extends from demochild --> error: meth1() in Child cannot override meth1() in Parent
        System.out.println("In Child meth1");
        return new DemoChild();
    }
}

class Client {
    public static void main(String[] args) {
        Parent obj = new Child();

        // System.out.println(obj.meth1());

        // DemoChild dc = obj.meth1();             // error: incompatible types: Demo cannot be converted to DemoChild
        // Demo d = obj.meth1();

        obj.meth1();
    }
}