interface A {
    int x = 10;
}
interface B {
    int x = 20;
}
class C implements A,B {
    // int x = 30;          // But if instance x is there it gives priority to itself only.
    void fun() {
        System.out.println(x);      // error: reference to x is ambiguous

        // System.out.println(A.x);
        // System.out.println(B.x);
    }
}

class Client {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
    }
}