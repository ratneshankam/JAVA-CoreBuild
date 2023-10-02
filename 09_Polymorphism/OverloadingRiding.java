class Overloading {
    // Due to method signature are same.
    
    void fun(int x) {         // error: missing method body, or declare abstract
    }

    // int fun(int y) {
    //     return 0;
    // }

    // void fun(int a) {}

    // error: method fun(int) is already defined in class Overloading
    public static void main(String[] args) {
        
    }
}

class Overriding extends Overloading {
    // int fun(int y) {                    // error: fun(int) in Overriding cannot override fun(int) in Overloading
    //     return 0;
    // }

    void fun(int a) {}                  // error: method fun(int) is already defined in class Overriding

}