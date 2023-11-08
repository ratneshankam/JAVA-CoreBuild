// finally Block

class Demo {
    void meth() {}

    public static void main(String[] args) {
        System.err.println("Stat main");    

        Demo obj = new Demo();
        obj = null;

        try {
            obj.meth();

        // } catch(NullPointerException ex) {
        } catch(ArithmeticException ex) {               // Not match found -> goes to the default exception handler [just like swith case default statement]
            // **IMP NOTE** --> And for not any found match catchCase: even the finally block executed but code terminates abnormally and default exception handler goes after finally execution
            
            System.out.println("exception handled");
            
        } finally {
            System.out.println("Connection closed");
        }

        System.out.println("End main");
    }
}