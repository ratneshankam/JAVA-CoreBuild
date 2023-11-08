class Demo {
    void fun() {System.out.println("Inside the fun method");}
    void prog5Dart() {
        // int y; 
        // Not allowed due to null safety i.e means must initialized before used.

        // Try to run in main
        Demo obj = new Demo();
        obj = null;
        obj.fun();                  // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo.fun()" because "<local1>" is null
    }
    public static void main(String[] args) {
        int x;
        // System.out.println(x);          // error: variable x might not have been initialized
        System.out.println(x=5);

    }
}
