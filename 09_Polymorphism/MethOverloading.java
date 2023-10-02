class Demo {
    void fun(Object o) {
        System.out.println("Inside fun(Object)");
    }
    void fun(int x) {
        System.out.println("Inside fun(int)");
    }
    void fun(float x) {
        System.out.println("Inside fun(float)");
    }
    void fun(Demo x) {
        System.out.println("Inside fun(Demo)");
        x.fun(1);
        
        System.out.println(x);
        System.out.println(this);
    }


    // page 96
    void fun(char c) {
        System.out.println("Inside fun(char)");
    }

    void fun(int x, float y) {
        System.out.println("Inside fun(int, float)");
    }
    void fun(float x, int y) {
        System.out.println("Inside fun(float, int)");
    }

    void fun(String s) {
        System.out.println("Inside fun(String)");
    }
    // void fun(StringBuilder s) {
    //     System.out.println("Inside fun(StringBuilder)");
    // }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun(1);
        obj.fun(1.4f);           // obj.fun(33.3); it's a double value look carefully
        obj.fun(new Demo());
        System.out.println(obj);        // Prints address

        obj.fun('A');           // sir's trap char goes internally int so gives error but it's not
        // obj.fun(1,1);   // error: reference to fun is ambiguous  fun(1,1);

        obj.fun("String given");
        // obj.fun(new StringBuilder("StringBuilder given"));

        // Works!!
        
        // obj.fun(null);              // --> ambiguous -- both method fun(Demo) in Demo and method fun(String) in Demo match  
        
    }
}