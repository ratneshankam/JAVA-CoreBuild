// Everything before main() is block and after that is method()
// But this statement can be false to create obj in static block (But companies does not allow this due to protocol)
class Demo {
    static {
        System.out.println("Inside static block");
        Demo obj = new Demo();
    }

    Demo() {
        System.out.println("Inside Constructor method");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }
}

