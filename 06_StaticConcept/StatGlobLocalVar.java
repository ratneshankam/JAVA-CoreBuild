class Demo {
    // static int y = 30;              // global

    static {                
        int y=20;                   // local
    }

    
    public static void main(String[] args) {
        // Even static variable initializes inside the static block 
        // But if we directly write inside static block it is it's local variable

        System.out.println(y);          // error: cannot find symbol
    }
}