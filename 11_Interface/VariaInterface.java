interface Demo {
    // Internally goes as -> public static final x;

    int x = 10; // Here initialization is compultion --> error: = expected

    static int y = 23;      // bytecode --> public static final int y;

    void fun(); // Internally goes as -> public abstract void fun()
}

class Asach {

    // int x; // --> without initialize variable works in class and inside methods too.

    static int y = 12;
}

class DemoChild implements Demo {
    public void fun() {
        // Bytecode madhe x ha pratek veles scope change zhala ki bipush hoto.
        System.out.println(x);
        System.out.println(Demo.x);
    }
}

class Client {
    public static void main(String[] args) {
        // int y;

        Demo obj = new DemoChild();
        obj.fun();
    }
}

// Bytecode verifies that interface does not have static block it's variables initializes only when child class comes into the picture.
/*
 * * BYTECODE OF DEMO.CLASS *
 * interface Demo {
 * public static final int x;
 * 
 * }
 

 *BYTECODE OF Asach.class
 * Compiled from "VariaInterface.java"
 * class Asach {
 * static int y;
 * 
 * Asach();
 * Code:
 * 0: aload_0
 * 1: invokespecial #1 // Method java/lang/Object."<init>":()V
 * 4: return
 * 
 * static {};
 * Code:
 * 0: bipush 12
 * 2: putstatic #7 // Field y:I
 * 5: return
 * }
 */