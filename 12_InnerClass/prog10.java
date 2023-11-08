class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner constr");
            System.out.println(this);
        }
    }

    Outer() {
        System.out.println("Outer constr");
        System.out.println(this);
    }
    
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        System.out.println(obj);

        Outer.Inner obj1 = obj.new Inner();
        System.out.println(obj1);
    }
}
