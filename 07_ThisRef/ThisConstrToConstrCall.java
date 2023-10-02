// ******* see the bytecode *******
class Demo {
    // instance variable initializes in every constructor even without calling
    // during object creation
    int x = 10;

    Demo() {
        // this(10);                                    // error: recursive constructor invocation
        // this(x);                                    // error: cannot reference x before supertype constructor has been called
        System.out.println("Inside NoArgs constr");
    }

    Demo(int x) {
        this();                                     // error: recursive constructor invocation
        this.x = x;
        System.out.println("Inside parameterized constr - int");
    }

    Demo(float x) {
        this((int) x);
        // this(x);                                 // error: recursive constructor invocation

        this.x = (int) x;

        // this();                              // error: call to this must be first statement in constructor

        System.out.println("Inside parameterized constr - float");
    }

    public static void main(String[] args) {
        Demo obj = new Demo(1f);
        obj.x = 3;
    }
}

// O/p:
// Inside NoArgs constr                                                  
// Inside parameterized constr - int
// Inside parameterized constr - float