// see the bytecode
class Demo {
    int x = 10;
    // instance variable initializes in every constructor even without calling during object creation
    Demo() {
        System.out.println("Inside NoArgs constr");
    }
    Demo(int x) {
        this.x = x;
        System.out.println("Inside parameterized constr");
    }
    Demo(float x) {
        this.x = (int)x;
        System.out.println("Inside parameterized constr");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}