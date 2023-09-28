class Demo {
    // System.out.println("In class");          // --> error: <identifier> expected / illegal start of type

    // Demo(int n) {}               // constructor creation by self

    
    public static void main(String[] args) {
        // After object creation constructor invokes implicitly by compiler called --> default constructor
        // But if you given it's called no-argument/unparameterized constructor

        Demo obj = new Demo();

        // error: constructor Demo in class Demo cannot be applied to given types;
        // Demo obj = new Demo();
        //            ^
        // required: int
        // found:    no arguments
        // reason: actual and formal argument lists differ in length
        // 1 error
    }
}