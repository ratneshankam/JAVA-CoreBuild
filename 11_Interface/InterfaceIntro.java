interface Demo {
    // int x = 3; 

    void fun();   // {} --> error: interface abstract methods cannot have body
}

class Child implements Demo {
    // error: Client is not abstract and does not override abstract method fun() in Demo

    // If doing class abstract void fun() should be proper else --> error: missing method body, or declare abstract

    // error: fun() in Client cannot implement fun() in Demo-->attempting to assign weaker access privileges; was public
    public void fun() {
        System.out.println("In Child fun");
    } 
}

class Client {
    public static void main(String[] args) {
        // Demo obj = new Demo();

        // error: Demo is abstract; cannot be instantiated


        // Interface method can be used as reference in object creation

        Demo obj = new Child();
        obj.fun();
    }    
}



/*

BYTECODE OF INTERFACE CLASS: 

Compiled from "InterfaceIntro.java"
interface Demo {
  public abstract void fun();
}

*/