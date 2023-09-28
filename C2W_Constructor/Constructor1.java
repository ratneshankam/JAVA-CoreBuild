// See the bytecode
class Demo {
    int x=10;
    static int y=20;
    // Demo() { System.out.println("In Constructor");}
    void meth() {
        System.out.println("Inside meth");
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        // meth();
        Demo obj = new Demo();
        obj.meth();
        // obj.x;  obj.y;               // error as not a statement
        System.out.println(obj.x);
        System.out.println(obj.y);      // works! but recommend as Demo.y as it's a static variable(should access by class)
    }
    
}
