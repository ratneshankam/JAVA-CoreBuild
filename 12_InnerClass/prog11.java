class Outer {
    int x = 1;
    static int y = 2;
    class Inner {
        void meth2() {
            System.out.println(x + y + " inner meth2 " + x + y);        // But parenthesis having higher precedence
            meth1();

            // Everything of outer Object's accessible in inner
        }
    }

    void meth1() {
        System.out.println("outer meth1");
    }
}

class Client {
    public static void main(String[] args) {
        Outer obj = new Outer();
        // obj.meth1();

        // obj.Inner obj1 = obj.new Inner();            // error: package obj does not exist

        Outer.Inner obj1 = obj.new Inner();
        obj1.meth2();

        // obj1.meth1();       // error: cannot find symbol
    }
}




/*  BYTECODE:
 * Compiled from "prog10.java"
class Outer$Inner {
  Outer$Inner(Outer);
    Code:
       0: aload_0
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String inner meth2
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}
 */