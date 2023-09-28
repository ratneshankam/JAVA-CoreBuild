class Demo {
    // Exception in thread "main" java.lang.StackOverflowError 
            // Demo() {
            //     Demo obj = new Demo();
            // }

    void meth() {
        Demo obj2 = new Demo();
        System.out.println(obj2);

    }
    public static void main(String[] args) {
        Demo obj = new Demo();      // Recursive call
        obj.meth();
        Demo obj3 = new Demo();

        System.out.println(obj);
        System.out.println(obj3);

    }
}