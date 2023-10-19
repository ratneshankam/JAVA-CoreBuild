class Singleton {
    static Singleton obj = new Singleton();
    private Singleton() {
        System.out.println("In singleton private constr");
    }
    static Singleton getObj() {
        return obj;
    }
}
class Client {
    public static void main(String[] args) {
        // Singleton s = new Singleton();          // Singleton() has private access in Singleton

        Singleton obj = Singleton.getObj();
        System.out.println(obj);
        Singleton obj1 = Singleton.getObj();
        System.out.println(obj1);
    }
}