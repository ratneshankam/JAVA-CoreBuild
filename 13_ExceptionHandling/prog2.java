// Java's Default exception handler
class Demo {
    void m1() {
        System.out.println(10/0);           // Exception occured here and kills further process

        m2();
    }

    void m2() {
        System.out.println("In m2");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        Demo obj = new Demo();
        obj.m1();               // Carry above exception here but still main also didn't handle it so it throws exception --> by default handler

        
        System.out.println("End main");
    }
}

/*  --->  o/p:
* Start main
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Demo.m1(prog2.java:3)
at Demo.main(prog2.java:14)
 */

//  Check source code
// import java.lang.ArithmeticException;


// But can be handled like this:

// For main:
// try {
//     obj.m1();
// } catch(Exception ex) {
//     System.out.println("exception handled");
// }

// For method:
// try {
//             System.out.println(10/0);
//         } catch(Exception ex) {
//             System.out.println("Exception handled");
//         }