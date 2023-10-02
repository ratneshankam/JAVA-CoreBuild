class MethSignature {
    //  error: method fun() is already defined in class MethSignature
    // It stores data related to method name and it's parameters
    void fun() {}
    // int fun() {return 0;}
    void fun(int x) {}
    void gun() {}

    void fun(int x, float y) { 
        System.out.print("in fun(int,float)");
    }
    void fun(float x, int y) {
        System.out.print("in fun(float,int)");
    }
    public static void main(String[] args) {
        MethSignature obj = new MethSignature();
        obj.fun(1,1.0f);
        obj.fun(1.0f,1);

        // --> error: reference to fun is ambiguous
        // obj.fun(1,1);
    }
}